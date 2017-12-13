package com.spring.api.myapirest.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="personas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
	@Id
    private String id;
    private String nombre;
    private String apellido;
}
