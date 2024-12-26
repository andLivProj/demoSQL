package org.example.demosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.example.model")
public class DemoSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSqlApplication.class, args);
    }

}
