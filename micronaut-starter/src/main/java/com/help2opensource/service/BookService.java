package com.help2opensource.service;

import com.help2opensource.model.Book;

public interface BookService {
    Iterable<Book> getAllBooks();

    Book getFirstBook();
}
