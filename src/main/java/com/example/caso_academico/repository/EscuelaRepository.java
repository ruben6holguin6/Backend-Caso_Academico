package com.example.caso_academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.caso_academico.entity.Escuela;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Long>{

}
