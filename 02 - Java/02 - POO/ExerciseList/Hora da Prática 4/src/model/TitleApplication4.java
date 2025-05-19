package model;

public class TitleApplication4 implements Comparable<TitleApplication4> {
  public String name;

  public TitleApplication4(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(TitleApplication4 current) {
    /*return current.name.compareTo(this.name);*/ // Decrescente
    return this.name.compareTo(current.name); // Crescente
  }
}
