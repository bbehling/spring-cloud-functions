package com.isoreg.serverless.functions;

import java.util.function.Function;

import com.isoreg.serverless.models.Re_Register;
import com.isoreg.serverless.repositories.RE_RegisterRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class FindAllFunc implements Function<String, Iterable<Re_Register>> {

    @Autowired
    private RE_RegisterRepository repository;

    @Override
    public Iterable<Re_Register> apply(String s) {
        return repository.findAll();
    }
}