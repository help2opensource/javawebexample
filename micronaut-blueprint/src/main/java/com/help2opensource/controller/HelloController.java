package com.help2opensource.controller;

import com.help2opensource.model.Book;
import com.help2opensource.repository.BookRepository;
import com.help2opensource.service.BookService;
import com.oracle.svm.core.annotate.Inject;

import io.micronaut.http.annotation.*;

@Controller("/hello")

public class HelloController {

    BookService bookService;

    public HelloController(BookService bookService) {
        this.bookService = bookService;
    }

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }

    @Get("/data")
    public Iterable<Book> data() {
        return bookService.getAllBooks();
    }

}