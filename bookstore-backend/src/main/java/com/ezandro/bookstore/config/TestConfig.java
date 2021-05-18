package com.ezandro.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ezandro.bookstore.services.DBService;

@Configuration
@Profile(value = "test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public void instanciarBaseDados() {
		this.dbService.instanciarBaseDados();
	}
	
}