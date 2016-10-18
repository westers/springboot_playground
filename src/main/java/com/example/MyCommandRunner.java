package com.example;

import com.example.config.ConnectionProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by amiga on 7/15/2016.
 */
@Component
public class MyCommandRunner implements CommandLineRunner {
    private final ConnectionProperties connection;

    @Autowired
    public MyCommandRunner(ConnectionProperties connection) {
        this.connection = connection;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Application Settings\n%s\n", this.connection.toString());
    }
}
