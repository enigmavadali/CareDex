package com.developer.keystone.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class DatabaseSnapshotService {

    private final String postgresHost;
    private final String postgresPort;
    private final String postgresDatabaseName;
    private final String postgresUsername;
    private final String postgresPassword;

    public DatabaseSnapshotService(
            @Value("${spring.datasource.url}") String postgresUrl,
            @Value("${spring.datasource.username}") String postgresUsername,
            @Value("${spring.datasource.password}") String postgresPassword) {
        this.postgresHost = postgresUrl.substring(postgresUrl.indexOf("//") + 2, postgresUrl.lastIndexOf(":"));
        this.postgresPort = postgresUrl.substring(postgresUrl.lastIndexOf(":") + 1, postgresUrl.lastIndexOf("/"));
        this.postgresDatabaseName = postgresUrl.substring(postgresUrl.lastIndexOf("/") + 1);
        this.postgresUsername = postgresUsername;
        this.postgresPassword = postgresPassword;
    }

    public void createSnapshotOfTable(String tableName, String snapshotFilePath) throws IOException, SQLException {
        Path snapshotFile = Paths.get(snapshotFilePath);

        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://" + postgresHost + ":" + postgresPort + "/" + postgresDatabaseName,
                postgresUsername, postgresPassword)) {
            String sql = "COPY " + tableName + " TO '" + snapshotFile.toAbsolutePath().toString() + "' WITH (FORMAT CSV, HEADER TRUE)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.execute();
            }
        }
    }
}
