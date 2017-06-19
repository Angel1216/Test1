package com.anzen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anzen.entity.EmpleadoEntity;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer> {


}
