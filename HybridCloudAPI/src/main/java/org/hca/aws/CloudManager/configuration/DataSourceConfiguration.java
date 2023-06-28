package org.hca.aws.CloudManager.configuration;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfiguration {

    @Value("${postgres.facility1.url}")
    private String facility1URL;

    @Value("${postgres.facility2.url}")
    private String facility2URL;

    @Value("${postgres.aggregation.url}")
    private String aggregateURL;

    @Value("${postgres.username}")
    private String postgresUsername;

    @Value("${postgres.password}")
    private String postgresPassword;

    @Value("${postgres.driver-class-name}")
    private String postgresDriver;

    @Bean
    public DataSource facility1DataSource(){
        PGSimpleDataSource postgresBuilder = new PGSimpleDataSource();
        postgresBuilder.setURL(facility1URL);
        postgresBuilder.setUser(postgresUsername);
        postgresBuilder.setPassword(postgresPassword);
        return postgresBuilder;
    }

    @Bean
    public JdbcTemplate facility1JDBCTemplate(){
        return new JdbcTemplate(this.facility1DataSource());
    }

    @Bean
    public DataSource facility2DataSource(){
        PGSimpleDataSource postgresBuilder = new PGSimpleDataSource();
        postgresBuilder.setURL(facility2URL);
        postgresBuilder.setUser(postgresUsername);
        postgresBuilder.setPassword(postgresPassword);
        return postgresBuilder;
    }

    @Bean
    public JdbcTemplate facility2JDBCTemplate(){
        return new JdbcTemplate(this.facility2DataSource());
    }

    @Bean
    public DataSource aggDataSource(){
        PGSimpleDataSource postgresBuilder = new PGSimpleDataSource();
        postgresBuilder.setURL(aggregateURL);
        postgresBuilder.setUser(postgresUsername);
        postgresBuilder.setPassword(postgresPassword);
        return postgresBuilder;
    }

    @Bean
    public JdbcTemplate aggJDBCTemplate(){
        return new JdbcTemplate(this.aggDataSource());
    }

//    @Bean(name="entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//
//        return sessionFactory;
//    }
}
