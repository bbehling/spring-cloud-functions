package com.isoreg.serverless.repositories;

import org.springframework.data.repository.CrudRepository;

import com.isoreg.serverless.models.RE_Register;

//@RepositoryRestResource
public interface RE_RegisterRepository extends CrudRepository<RE_Register, Long> {
    Iterable<RE_Register> findAll();
}