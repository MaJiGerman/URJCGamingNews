package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUserLoader {

	@Autowired
	private UserRepository repositorioUsuario;
	
	@PostConstruct
	private void initDatabase() {
		
		repositorioUsuario.save(new User("user","pass","juansilvamora@gamil.com","ROLE_ADMIN"));
		
	}
	
	
}