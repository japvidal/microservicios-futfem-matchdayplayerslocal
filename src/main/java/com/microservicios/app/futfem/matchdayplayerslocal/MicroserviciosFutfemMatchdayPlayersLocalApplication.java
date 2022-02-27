package com.microservicios.app.futfem.matchdayplayerslocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosFutfemMatchdayPlayersLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosFutfemMatchdayPlayersLocalApplication.class, args);
	}

}
