package com.sirak.day1homework1.controller;

import com.sirak.day1homework1.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/")
    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();

        Book book = new Book(1, "Test Book", "328492-234");
        bookList.add(book);
        return bookList;
    }
}
