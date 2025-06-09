package br.com.springi;

import br.com.springi.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Exercício 1 e 3
		List<Integer> numeros = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));
		List<Integer> newNumeros = new ArrayList<>();
		numeros.stream()
						.filter(p -> p % 2 == 0)
						.forEach(number -> newNumeros.add(number*2));

		System.out.println("Exercício 1 e 3");
		System.out.println("Lista completa: " + numeros);
		System.out.println("Lista dos pares multiplicados por 2: " + newNumeros);
		System.out.println("-------------------------------");

		// Exercício 2
		List<String> palavras = new ArrayList<>(Arrays.asList("java", "stream", "lambda"));
		List<String> newPalavras = new ArrayList<>();

		palavras.stream()
						.forEach(word -> newPalavras.add(word.toUpperCase()));

		System.out.println("Exercício 2");
		System.out.println("Padrão: " + palavras);
		System.out.println("Caixa alta: " + newPalavras);
		System.out.println("-------------------------------");

		// Exercício 4
		List<String> lista = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));
		List<String> newLista = new ArrayList<>(Arrays.asList());

		lista.stream()
						.distinct() // Remover itens duplicados na lista.
						.sorted(Comparator.reverseOrder())
						.forEach(current -> newLista.add(current));

		System.out.println("Exercício 4");
		System.out.println("Padrão: " + lista);
		System.out.println("Sem duplicação: " + newLista);
		System.out.println("-------------------------------");

		// Exercício 5
		List<List<Integer>> listaNumeros = Arrays.asList(
						Arrays.asList(1,2,3),
						Arrays.asList(4,5,6),
						Arrays.asList(7,8,9)
		);
		List<Integer> newListaNumeros = new ArrayList<>(Arrays.asList());

		listaNumeros.stream()
						.flatMap(list -> list.stream())
						.forEach(prime -> {
							int cont = 0;
							for (int i = 1; i <= prime; i++){
								if(prime % i == 0){
									cont++;
								}
							}
							if(cont == 2){
								newListaNumeros.add(prime);
							}
						});

		System.out.println("Exercício 5");
		System.out.println("Lista dos números primos: " + newListaNumeros);
		System.out.println("-------------------------------");

		// Exercício 6

		List<Person> listPerson = new ArrayList<>();
		List<Person> newListPerson = new ArrayList<>();

		listPerson.add(new Person("Igor", 32));
		listPerson.add(new Person("Teste", 4));
		listPerson.add(new Person("Renato", 18));

		listPerson.stream()
						.filter(e -> e.getAge() >= 18)
						.forEach(current -> newListPerson.add(current));

		System.out.println("Exercício 6");
		System.out.println("Lista completa: " + listPerson);
		System.out.println("Lista maior de idade: " + newListPerson);
		System.out.println("-------------------------------");
	}
}
