package com.anzen.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anzen.entity.EmpleadoEntity;
import com.anzen.repository.EmpleadoRepository;
import com.anzen.service.EmpleadoService;
@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	EmpleadoRepository empleadorepository;
	
	public List<EmpleadoEntity> findAll(){
		return empleadorepository.findAll();
	}
	
	
}
