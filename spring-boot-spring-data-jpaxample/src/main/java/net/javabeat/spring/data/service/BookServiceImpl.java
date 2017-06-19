package net.javabeat.spring.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.javabeat.spring.data.domain.Book;
import java.util.List;


@Service
@Transactional
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
//	@Autowired
//	private BookOwnRepository bookOwnRepository;

	public List<Book> findAll(){
		return (List<Book>) bookRepository.findAll();
	}
	
//	public List<Book> findByName(String name){
//		return bookOwnRepository.findByName(name);
//	}
	
//	public List<Book> findByPrice(long price){
//		return bookOwnRepository.findByPrice(price);
//	}
	
//	public List<Book> findByNameAndAuthor(String name, String author){
//		return bookOwnRepository.findByNameAndAuthor(name,author);
//	}
	
	public void saveBook(Book book){
		bookRepository.save(book);
	}
	
	public Book findOne(long id){
		return bookRepository.findOne(id);
	}
	
	public void delete(long id){
		bookRepository.delete(id);
	}
}