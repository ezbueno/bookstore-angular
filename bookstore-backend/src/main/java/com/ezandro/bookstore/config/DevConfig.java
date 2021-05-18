package com.ezandro.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ezandro.bookstore.services.DBService;

@Configuration
@Profile(value = "dev")
public class DevConfig {

	@Autowired
	private DBService dbService;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	public String strategy;

	@Bean
	public boolean instanciarBaseDados() {
		if (strategy.equals("create")) {
			this.dbService.instanciarBaseDados();
		}
		return false;
	}

}