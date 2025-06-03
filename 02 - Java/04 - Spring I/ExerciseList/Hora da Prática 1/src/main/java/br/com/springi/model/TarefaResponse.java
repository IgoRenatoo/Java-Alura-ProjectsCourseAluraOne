package br.com.springi.model;

public class TarefaResponse {
  private PokemonData[] results;

  public PokemonData[] getTarefaResults() {
    return results;
  }
  public void getTarefaResults(PokemonData[] results) {
    this.results = results;
  }
}
