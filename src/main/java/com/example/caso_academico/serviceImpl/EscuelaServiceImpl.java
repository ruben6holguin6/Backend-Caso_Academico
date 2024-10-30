package com.example.caso_academico.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.caso_academico.entity.Escuela;
import com.example.caso_academico.repository.EscuelaRepository;
import com.example.caso_academico.service.EscuelaService;

@Service
public class EscuelaServiceImpl implements EscuelaService{

	@Autowired
	private EscuelaRepository escuelaRepository;
	
	@Override
	public Escuela create(Escuela a) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(a);
	}

	@Override
	public Escuela update(Escuela a) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		escuelaRepository.deleteById(id);
	}

	@Override
	public Optional<Escuela> read(Long id) {
		// TODO Auto-generated method stub
		return escuelaRepository.findById(id);
	}

	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return escuelaRepository.findAll();
	}

}
