package com.isoreg.serverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Supplier;

import com.isoreg.serverless.repositories.RE_RegisterRepository;

@SpringBootApplication
public class CloudFunctionAwsApplication {

    @Autowired
    private RE_RegisterRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionAwsApplication.class, args);
    }

    // Use Supplier interface to support get mapping
    // https://cloud.spring.io/spring-cloud-static/spring-cloud-function/2.0.0.RELEASE/single/spring-cloud-function.html#_standalone_web_applications
    @Bean
    @ResponseBody
    public Supplier<GatewayResponse> findAllBean() {
        System.out.println("findAllBean");
        GatewayResponse gr = new GatewayResponse(repository.findAll(), 200);

        System.out.println("repository.findAll()");
        // return () -> "done";
        return () -> gr;
    }

}
