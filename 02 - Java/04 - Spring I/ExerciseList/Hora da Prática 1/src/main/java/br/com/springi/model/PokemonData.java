package br.com.springi.model;

public class PokemonData {
  private int id;
  private String name;

  public PokemonData(int id, String name) {
    this.id = id;
    this.name = name;
  }
  public PokemonData() {
  }
  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  @Override
  public String toString() {
    return "ID: " + this.id + ", Name: " + this.name;
  }
}
