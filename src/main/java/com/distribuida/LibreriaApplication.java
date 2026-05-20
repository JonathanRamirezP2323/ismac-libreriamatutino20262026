package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);

		System.out.println("HOLA MUNDO DESDE SPRING BOOT!!!....");

		Cliente cliente = new Cliente(
				1
				, "170123457"
				, "Omar"
				, "Viracucha"
				, "Quito"
				, "0987456771"
				, "oviracucha@correo.com"
		);

		System.out.println(cliente.toString());
	}
}
