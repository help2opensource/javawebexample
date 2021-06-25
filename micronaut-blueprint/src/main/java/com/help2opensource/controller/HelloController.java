package com.help2opensource.controller;

import com.oracle.svm.core.annotate.Inject;

import io.micronaut.http.annotation.*;

@Controller("/hello")

public class HelloController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}