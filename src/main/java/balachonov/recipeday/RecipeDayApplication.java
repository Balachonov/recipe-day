package balachonov.recipeday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RecipeDayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeDayApplication.class, args);
    }
}