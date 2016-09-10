package daggerok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class HerokuApplication {

    @Bean
    public CommandLineRunner testData() {
        return args -> log.info("hi");
    }

    public static void main(String[] args) {
        SpringApplication.run(HerokuApplication.class, args);
    }
}
