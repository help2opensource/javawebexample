package com.help2opensource.controller;

import com.help2opensource.model.Book;
import com.help2opensource.service.BookService;

import io.micronaut.http.annotation.*;
import io.micronaut.views.ModelAndView;

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

    @Get("/book")
    public Book firstBook() {
        return bookService.getFirstBook();
    }

    @Get("/view")
    public ModelAndView firstBookView() {
        return new ModelAndView("home", bookService.getFirstBook());
    }

}