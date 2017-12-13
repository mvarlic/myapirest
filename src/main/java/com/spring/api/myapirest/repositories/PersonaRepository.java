package com.spring.api.myapirest.repositories;

import com.spring.api.myapirest.models.Persona;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.io.Serializable;

@RepositoryRestResource(collectionResourceRel="personas",path="personas")
public interface PersonaRepository extends CrudRepository<Persona,Serializable> {

}
