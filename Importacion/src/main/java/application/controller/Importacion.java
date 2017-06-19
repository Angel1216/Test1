package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Controlador Importacion
 */
@Controller
public class Importacion {

	
	  /**
	   * Example
	  */
	  @RequestMapping(value="/welcome")
	  public void create() {
	    try {
	      System.out.println("Welcome!!");
	    }
	    catch (Exception ex) {
	      ex.printStackTrace();
	    }
	  }
	
	
}
