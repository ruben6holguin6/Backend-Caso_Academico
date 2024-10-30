package com.example.caso_academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.caso_academico.entity.Facultad;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long>{

}
