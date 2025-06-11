package br.com.springi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Exercício 1
		List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
		Optional<Integer> maxNumber = numeros.stream()
						.max(Comparator.naturalOrder());
		System.out.println("Exercício 1");
		maxNumber.ifPresent(n -> System.out.println("O maior número é: " + n));
		System.out.println("------------------------");

		// Exercício 2
		List<String> palavras = new ArrayList<>(Arrays.asList("java", "stream", "lambda", "code", "teste"));

		Map<Integer, List<String>> groupWord = palavras.stream()
						.collect(Collectors.groupingBy(s -> s.length()));

		System.out.println("Exercício 2");
		System.out.println("Os grupos ficaram nessa configuração: " + groupWord);
		System.out.println("------------------------");

		// Exercício 3
		List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

		String concatName = nomes.stream().collect(Collectors.joining(", "));
		System.out.println("Exercício 3");
		System.out.println("Nomes concatenados: " + concatName);
		System.out.println("------------------------");
	}
}
