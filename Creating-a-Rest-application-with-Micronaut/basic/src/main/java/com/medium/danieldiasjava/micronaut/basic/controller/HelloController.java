package com.medium.danieldiasjava.micronaut.basic.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get("/")
    public HttpResponse<?> getHello() {
        return HttpResponse.status(HttpStatus.OK).body("My first App in Micronaut : )");
    }
}