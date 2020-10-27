package com.bookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
@Service
public interface BookService {
    List<Book> getAllBooks();
    List<Book> getByAuthor(String author);
    Book getById(int id);
    List<Book> getByCategory(String category);
}
