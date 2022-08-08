package br.com.fiap.viagem.viagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.fiap.controllers")
public class ViagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViagemApplication.class, args);
	}

}
