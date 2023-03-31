package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    SomeService someService;

    public static void main(String[] args) {
        System.setProperty("my_password", "mySecretKey12345");
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        someService.doTryEncryption();
        someService.doGetEncryptedProperties();
    }
}