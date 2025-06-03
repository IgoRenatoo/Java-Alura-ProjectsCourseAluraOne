package br.com.springi;

import br.com.springi.model.GetData;
import br.com.springi.model.PokemonResponse;
import br.com.springi.model.PokemonResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class MainSpringI implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(MainSpringI.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Aplicação Spring Boot iniciada!");

    var newSearch = new GetData("https://pokeapi.co/api/v2/pokemon/?offset=0&limit=1302");

    ObjectMapper mapper = new ObjectMapper();
    PokemonResponse response = mapper.readValue(newSearch.fetchData(), PokemonResponse.class);

    System.out.println("xxxxxxxxxx" + response.getCount());
    for (int i = 0; i < response.getCount(); i++) {
      System.out.println("ID: " + (i+1) + ", Name: " + response.getResults().get(i).getName());
    }
  }
}
