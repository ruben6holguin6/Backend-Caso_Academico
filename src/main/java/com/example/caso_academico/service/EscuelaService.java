package com.example.caso_academico.service;

import java.util.List;
import java.util.Optional;

import com.example.caso_academico.entity.Escuela;

public interface EscuelaService {
	Escuela create(Escuela a);
	Escuela update(Escuela a);
	void delete(Long id);
	Optional<Escuela> read(Long id);
	List<Escuela> readAll();
}
