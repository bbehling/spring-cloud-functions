package com.isoreg.serverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.isoreg.serverless.models.RE_Register;
import com.isoreg.serverless.repositories.RE_RegisterRepository;

@SpringBootApplication
public class CloudFunctionAwsApplication {

    @Autowired
    private RE_RegisterRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionAwsApplication.class, args);
    }

    @Bean
    public Function<String, String> reverseString() {
        return value -> new StringBuilder(value).reverse().toString();
    }

    @Bean
    public Function<String, Iterable<RE_Register>> findAllBean() {
        return value -> repository.findAll();
    }

}
