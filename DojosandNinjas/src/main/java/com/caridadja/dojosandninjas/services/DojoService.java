package com.caridadja.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.caridadja.dojosandninjas.models.Dojo;
import com.caridadja.dojosandninjas.repositories.DojoRepository;
import com.caridadja.dojosandninjas.repositories.NinjaRepository;

@Service
public class DojoService {
	
	private final DojoRepository dojoRepository;
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}

	public List<Dojo> allDojos(){
		return (List<Dojo>) dojoRepository.findAll();
	}
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	public Dojo findDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		if(dojo.isPresent()) {
			Dojo showDojo = dojo.get();
			return showDojo;
		}
		else {
			return null;
		}
	}
}
