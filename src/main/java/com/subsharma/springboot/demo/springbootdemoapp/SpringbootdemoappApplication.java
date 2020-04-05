package com.subsharma.springboot.demo.springbootdemoapp;

import com.subsharma.springboot.demo.springbootdemoapp.dao.EmployeeDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class SpringbootdemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoappApplication.class, args);
	}


}
