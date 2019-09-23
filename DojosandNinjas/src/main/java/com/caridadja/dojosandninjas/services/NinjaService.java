package com.caridadja.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.caridadja.dojosandninjas.models.Ninja;
import com.caridadja.dojosandninjas.repositories.DojoRepository;
import com.caridadja.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	private final NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public List<Ninja> allNinjas(){
		return (List<Ninja>) ninjaRepository.findAll();
	}
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
}
