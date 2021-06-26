package com.help2opensource.service;

import javax.inject.Singleton;

import com.help2opensource.model.Book;
import com.help2opensource.repository.BookRepository;
import com.oracle.svm.core.annotate.Inject;

@Singleton
public class BookServiceImplement implements BookService {

    @Inject
    BookRepository bookRepository;

    public BookServiceImplement(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> getAllBooks() {

        return bookRepository.findAll();
    }

    @Override
    public Book getFirstBook() {
        long i = 1L;
        return bookRepository.findById(i);
    }

}
