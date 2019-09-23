package com.caridadja.dojosandninjas.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.caridadja.dojosandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

}
