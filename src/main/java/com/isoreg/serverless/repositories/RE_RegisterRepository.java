package com.isoreg.serverless.repositories;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.isoreg.serverless.models.RE_Register;

//@RepositoryRestResource
public interface RE_RegisterRepository extends CrudRepository<RE_Register, Long> {
    Iterable<RE_Register> findAll();
}