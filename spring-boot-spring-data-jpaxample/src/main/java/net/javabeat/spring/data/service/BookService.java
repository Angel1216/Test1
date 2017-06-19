package net.javabeat.spring.data.service;

import net.javabeat.spring.data.domain.Book;
import java.util.List;

public interface BookService {
	public List<Book> findAll();
	public void saveBook(Book book);
	public Book findOne(long id);
	public void delete(long id);
//	public List<Book> findByName(String name);
//	public List<Book> findByNameAndAuthor(String name, String author);
//	public List<Book> findByPrice(long price);
}
