package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
@Service
public class BookDAOImpl implements BookDAO {
	
	

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> newBookList = new ArrayList<>();
		for (Book book : showBookList()) {
			if (book.getAuthor().equals(author)) {
				newBookList.add(book);
			}
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		Book newBook = new Book();
		for (Book book : showBookList()) {
			if (book.getBookId().equals(id)) {
				newBook = book;
			}
		}
		return newBook;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newBookList = new ArrayList<>();
		for (Book book : showBookList()) {
			if (book.getCategory().equals(category)) {
				newBookList.add(book);
			}
		}
		return newBookList;
	}

	private List<Book> showBookList() {
		return Arrays.asList(new Book(1, "Learn Java", "Tech", "Kathy", 900.0),
				new Book(2, "7 Habits", "Selfhelp", "Steve", 700.0), new Book(3, "Ikigai", "Selfhelp", "Tom", 1900.0),
				new Book(4, "Learn Java", "Tech", "Kathy", 900.0));
	}
}