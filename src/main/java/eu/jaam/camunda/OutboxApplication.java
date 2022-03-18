package eu.jaam.camunda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OutboxApplication {
    public static void main(String... args) {
        SpringApplication.run(OutboxApplication.class, args);
    }
}
