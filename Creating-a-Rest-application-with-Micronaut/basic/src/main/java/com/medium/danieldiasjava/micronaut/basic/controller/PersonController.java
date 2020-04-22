package com.medium.danieldiasjava.micronaut.basic.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import com.medium.danieldiasjava.micronaut.basic.model.Message;
import com.medium.danieldiasjava.micronaut.basic.model.Person;
import com.medium.danieldiasjava.micronaut.basic.repository.PersonRepository;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;


@Validated
@Controller("/persons")
public class PersonController {

    @Inject
    private PersonRepository personRepository;

    @Post()
    public HttpResponse<?> savePerson(@Body @Valid Person person) {
        this.personRepository.save(person);
        return HttpResponse.status(HttpStatus.CREATED).body(new Message(HttpStatus.CREATED.getCode(),"Saved successfully !"));
    }

    @Get()
    public HttpResponse<?> getPersons() {
        return HttpResponse.status(HttpStatus.OK).body(this.personRepository.findAll());
    }
}