package com.bookapp.service;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookDAO;
import com.bookapp.dao.BookDAOImpl;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

 
@Service
public class BookServiceImpl implements BookService{

 
    @Autowired
    BookDAO bookDAO;
    @Override
    public List<Book> getAllBooks() {
        // TODO Auto-generated method stub
        return bookDAO.getAllBooks();
    }

 

    @Override
    public List<Book> getByAuthor(String author) throws BookNotFoundException {
        // TODO Auto-generated method stub
        return bookDAO.getByAuthor(author);
    }

 

    @Override
    public Book getById(int id) throws BookNotFoundException {
        // TODO Auto-generated method stub
        return bookDAO.getById(id);
    }

 

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        // TODO Auto-generated method stub
        return bookDAO.getByCategory(category);
    }

 

}
