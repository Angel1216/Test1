package com.anzen.service;

import com.anzen.bean.Book;
import java.util.List;

public interface BookService {
	
	// CrudRepository
	public Book findOne(long id);
	public List<Book> findAll();
	
	// OwnRepository
	public Book getById(long id);
	public List<Book> getAll();
	public String getCallSP();
	
	// BookOwnHibernateRepository
	public List<Book> getAllBooks();
	public List<Book> getBook(long id);
	
}
