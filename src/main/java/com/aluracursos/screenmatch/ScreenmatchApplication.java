package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.principal.Principal;
import com.aluracursos.screenmatch.repository.SerieRepository;
import com.sun.tools.javac.Main;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication{


	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		// Establece las propiedades de Spring a partir de las variables de entorno

		// Base de datos
		System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
		System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
		System.setProperty("DB_USER", dotenv.get("DB_USER"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

		// Api_key
		System.setProperty("OMDB_API_KEY", dotenv.get("OMDB_API_KEY"));

//		SpringApplication.run(Main.class, args);
		SpringApplication.run(ScreenmatchApplication.class, args);
	}
}
