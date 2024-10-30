package com.example.caso_academico.service;

import java.util.List;
import java.util.Optional;

import com.example.caso_academico.entity.Facultad;

public interface FacultadService {
	Facultad create(Facultad a);
	Facultad update(Facultad a);
	void delete(Long id);
	Optional<Facultad> read(Long id);
	List<Facultad> readAll();
}
