package com.iterror.springboot.mybatis;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.springframework.boot.SpringApplication.*;

/**
 * Created by tony.yan
 */

@ComponentScan(basePackages ="com.iterror.springboot.mybatis")
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(Application.class, args);
    }

}

