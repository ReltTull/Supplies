package com.Supplies.Supplies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO: веб-страницу, на которой вводишь данные supply.
 * Реализовать mvc-модель с контроллерами добавления, изменения и удаления записей в таблице supply
 */
@SpringBootApplication
public class SuppliesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuppliesApplication.class, args);
	}

}
