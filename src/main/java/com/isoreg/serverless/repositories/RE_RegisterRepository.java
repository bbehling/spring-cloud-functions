package com.isoreg.serverless.repositories;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.isoreg.serverless.models.Re_Register;

//@RepositoryRestResource
public interface RE_RegisterRepository extends CrudRepository<Re_Register, Long> {
    Iterable<Re_Register> findAll();
}