package com.everis.alimentatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AlimentatecConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlimentatecConfigServerApplication.class, args);
	}
}
