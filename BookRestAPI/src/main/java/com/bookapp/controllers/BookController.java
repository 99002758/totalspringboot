package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
  
@RestController
@RequestMapping("/book-api")
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> showAllBooks(){
		return bookService.getAllBooks();
	}
	@GetMapping("/books-by-author/{author}")
	public List<Book> showBooksByAuthor(@PathVariable("author")String author)throws BookNotFoundException{
		return bookService.getByAuthor(author);
	}
	@GetMapping("/books-by-category")
	public List<Book> showBooksByCategory(@RequestParam("category")String category)throws BookNotFoundException{
		return bookService.getByCategory(category);
	}
	@GetMapping("/books-by-Id/{bookId}")
	public Book showById(@PathVariable("bookId")int id) throws BookNotFoundException{
		return bookService.getById(id);
	}
	 @ExceptionHandler(BookNotFoundException.class)
	    public String handleException(Exception e) {
	    	return "error:"+e.getMessage();
	    }

}
