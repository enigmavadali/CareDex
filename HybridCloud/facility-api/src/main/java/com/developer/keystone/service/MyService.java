package com.developer.keystone.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;

@Service
public class MyService {

    private final DatabaseSnapshotService databaseSnapshotService;

    public MyService(DatabaseSnapshotService databaseSnapshotService) {
        this.databaseSnapshotService = databaseSnapshotService;
    }

    public void createSnapshot() {
        try {
            databaseSnapshotService.createSnapshotOfTable("residentinfacility1", "/Users/niveditamishra/Downloads/snapshot.csv");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
