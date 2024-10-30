package com.example.caso_academico.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.caso_academico.entity.Facultad;
import com.example.caso_academico.repository.FacultadRepository;
import com.example.caso_academico.service.FacultadService;

@Service
public class FacultadServiceImpl implements FacultadService{

	@Autowired
	private FacultadRepository facultadRepository;
	
	@Override
	public Facultad create(Facultad a) {
		// TODO Auto-generated method stub
		return facultadRepository.save(a);
	}

	@Override
	public Facultad update(Facultad a) {
		// TODO Auto-generated method stub
		return facultadRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facultadRepository.deleteById(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return facultadRepository.findById(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return facultadRepository.findAll();
	}

}
