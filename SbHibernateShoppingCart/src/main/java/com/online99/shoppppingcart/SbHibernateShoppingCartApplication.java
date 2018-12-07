package com.online99.shoppppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.online99.shoppppingcart"})
@SpringBootApplication
public class SbHibernateShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbHibernateShoppingCartApplication.class, args);
	}
}
