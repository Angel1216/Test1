package com.anzen.controller;

import org.springframework.web.bind.annotation.RestController;
import com.anzen.bean.Book;
import com.anzen.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@RestController
public class BooksController {

	// Inyeccion de dependencias del servicio
	@Autowired
	private BookService bookService;

	
	// Metodos
	
	// CrudRepository
	@RequestMapping(value = "/CrudRepository/{id}")
	public Book getBook(@PathVariable int id) {
		Book book = bookService.findOne(id);
		return book;
	}
	
	@RequestMapping(value = "/CrudRepository/")
	public List<Book> getBooks() {
		return bookService.findAll();
	}
	
	
	
	// OwnRepository
	@RequestMapping(value = "/JPA/manual/{id}")
	public Book getById(@PathVariable int id) {
		Book book = bookService.getById(id);
		return book;
	}
	
	@RequestMapping(value = "/JPA/manual/")
	public List<Book> getAll() {
		return bookService.getAll();
	}
	
	@RequestMapping(value = "/JPA/manual/SP")
	public String getSP() {
		return bookService.getCallSP();
	}
	
	
	
	// BookOwnHibernateRepository
	@RequestMapping(value = "/hibernate/manual/All/HB")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@RequestMapping(value = "/hibernate/manual/One/HB/{id}")
	public List<Book> getBook(@PathVariable long id) {
		return bookService.getBook(id);
	}

}
