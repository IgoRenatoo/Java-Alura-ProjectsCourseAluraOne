package model;

public class Titulo {
  private String nome;
  private String autor;
  private int ano;

  public Titulo(String nome, String autor, int ano) {
    this.nome = nome;
    this.autor = autor;
    this.ano = ano;
  }

  public String getNome() {
    return nome;
  }

  public String getAutor() {
    return autor;
  }

  public int getAno() {
    return ano;
  }
}
