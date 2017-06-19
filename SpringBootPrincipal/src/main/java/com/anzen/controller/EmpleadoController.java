package com.anzen.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anzen.entity.EmpleadoEntity;
import com.anzen.service.EmpleadoService;




@RestController
@RequestMapping("/Empleado")
public class EmpleadoController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	EmpleadoService empleadoService;

	@RequestMapping(value = "/Consulta")
	List<EmpleadoEntity> index() {
		List<EmpleadoEntity> list= new ArrayList<EmpleadoEntity>();		 //String index() {
		System.out.println("Hola");
		try {
			 list=empleadoService.findAll();
		} catch (Exception e) {
			 e.printStackTrace();
		}
		 
		//return "Hola";
		 
		  return list;
	}

	@RequestMapping("/libre")
	String indexx() {
		return "Edwin";

	}

	

}