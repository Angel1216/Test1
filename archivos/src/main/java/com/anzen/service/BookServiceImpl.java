package com.anzen.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.anzen.dao.BookCrudRepository;
import com.anzen.dao.BookOwnRepository;
import com.anzen.dao.BookOwnHibernateRepository;
import com.anzen.bean.Book;
import java.util.List;


@Service
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookCrudRepository bookRepository;
	
	@Autowired
	private BookOwnRepository bookOwnRepository; 
	
	@Autowired
	private BookOwnHibernateRepository bookOwnHibernateRepository;
	
	// CrudRepository
	public Book findOne(long id) {
		return bookRepository.findOne(id);
	}

	public List<Book> findAll() {
		return (List<Book>) bookRepository.findAll();
	}


	// OwnRepository
	public Book getById(long id) {
		return bookOwnRepository.getById(id);
	}
	
	public List<Book> getAll() {
		return bookOwnRepository.getAll();
	}

	@Override
	public String getCallSP() {
		return bookOwnRepository.getCallSP();
	}

	
	// BookOwnHibernateRepository
	@Override
	public List<Book> getAllBooks() {
		return bookOwnHibernateRepository.getAllBooks();
	}

	@Override
	public List<Book> getBook(long id) {
		return bookOwnHibernateRepository.getBook(id);
	}

}
