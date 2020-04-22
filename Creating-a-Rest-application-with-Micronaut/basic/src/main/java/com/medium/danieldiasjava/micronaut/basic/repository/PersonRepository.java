package com.medium.danieldiasjava.micronaut.basic.repository;

import com.medium.danieldiasjava.micronaut.basic.model.Person;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> { }