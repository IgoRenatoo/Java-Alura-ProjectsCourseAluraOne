package br.com.springi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonResponse {
  private int count;
  private List<PokemonResult> results;

  // Getters e Setters
  public int getCount() {
    return count;
  }

  public List<PokemonResult> getResults() {
    return results;
  }

  public void setResults(List<PokemonResult> results) {
    this.results = results;
  }
}
