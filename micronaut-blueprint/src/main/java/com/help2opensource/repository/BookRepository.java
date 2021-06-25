package com.help2opensource.repository;

import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.*;
import io.micronaut.data.repository.CrudRepository;

import com.help2opensource.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    @Executable
    Book findByTitle(String title);
}
