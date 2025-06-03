package br.com.springi;

import br.com.springi.model.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class MainSpringI implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(MainSpringI.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    List<PokemonData> listPokemon = new LinkedList<>();
    System.out.println("Aplicação Spring Boot iniciada!");
    try {
      var newSearch = new GetData("https://pokeapi.co/api/v2/pokemon/?offset=0&limit=1302");

      ObjectMapper mapper = new ObjectMapper();
      PokemonResponse response = mapper.readValue(newSearch.fetchData(), PokemonResponse.class);

      System.out.println("Quantidade de pokemons encontrados: " + response.getCount());
      for (int i = 0; i < response.getCount(); i++) {
        listPokemon.add(new PokemonData((i + 1), response.getResults().get(i).getName()));
      }
      // Exercício 1
      mapper.writerWithDefaultPrettyPrinter().writeValue(new File("tarefa.json"), listPokemon);
      System.out.println("Arquivo escrito com sucesso!");

      // Exercício 2
      var typeReturn = new TypeReference<List<PokemonData>>(){};
      var tarefaResponse = mapper.readValue(new File("tarefa.json"), typeReturn);
      listPokemon.clear();
      for (int i = 0; i < 10; i++) {
        listPokemon.add(tarefaResponse.get(i));
      }
      System.out.println(listPokemon);
    } catch (Exception e) {
      System.out.println("Erro na aplicação: " + e.getMessage());
    }
  }
}
