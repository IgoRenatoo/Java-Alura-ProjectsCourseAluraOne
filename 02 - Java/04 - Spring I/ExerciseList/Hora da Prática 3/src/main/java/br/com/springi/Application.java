package br.com.springi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Exercício 1
		List<Integer> numeros = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));
		List<Integer> newNumeros = new ArrayList<>();
		numeros.stream()
						.filter(p -> p % 2 == 0)
						.forEach(number -> newNumeros.add(number));

		System.out.println("Lista completa: " + numeros);
		System.out.println("Lista dos pares: " + newNumeros);
	}
}
