package org.hca.aws.CloudManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CloudManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudManagerApplication.class, args);
	}

}
