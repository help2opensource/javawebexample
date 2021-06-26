package com.help2opensource.service;

import javax.inject.Singleton;

import com.help2opensource.model.Book;
import com.help2opensource.repository.BookRepository;
import com.oracle.svm.core.annotate.Inject;

@Singleton
public class BookServiceImplement2 {

    @Inject
    BookRepository bookRepository;

    public BookServiceImplement2(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> getAllBooks() {

        return bookRepository.findAll();
    }

}
