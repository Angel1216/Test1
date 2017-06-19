package com.anzen.dao;

import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import com.anzen.bean.Book;
import java.util.List;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.ParameterMode;

@Repository
@Transactional
public class BookOwnRepository {
	
	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entityManager;
	
	
	  /**
	   * Return all the users stored in the database.
	   */
	  @SuppressWarnings("unchecked")
	  public List<Book> getAll() {
	    return entityManager.createQuery("from Book").getResultList();
	  }

	  /**
	   * Return the user having the passed id.
	   */
	  public Book getById(long id) {
	    return entityManager.find(Book.class, id);
	  }
	  
	  
	  
	  /**
	   * Invoke a Stored Procedure
	   */
	  public String getCallSP(){
		  
		  // Variable
		  String suma = "";
		  try{
			  // Create Call Stored Procedure
			  //entityManager.getTransaction().begin();
			  StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("sumaXY");
			  
			  // Set Parameters
			  storedProcedure.registerStoredProcedureParameter("x", Integer.class, ParameterMode.IN);
			  storedProcedure.registerStoredProcedureParameter("y", Integer.class, ParameterMode.IN);
			  storedProcedure.registerStoredProcedureParameter("suma", String.class, ParameterMode.OUT);
			  
			  storedProcedure.setParameter("x", 13);
			  storedProcedure.setParameter("y", 15);
			  
			  // execute SP
		      storedProcedure.execute();
		        
		      // get result
		      suma = (String)storedProcedure.getOutputParameterValue("suma");
		        System.out.println("La suma es: " + suma);
			  
		      //entityManager.getTransaction().commit();
		      //entityManager.close();
		        
			  
		  } catch(Exception ex){
			  System.out.println(ex.getMessage());
		  }
		  
		  return "La suma es: " + suma;
	  }
	  
}
