package model;

public class Animal {
  protected int paws;
  protected String type;
  private String name;

  public Animal(int paws, String type) {
    this.paws = paws;
    this.type = type;
  }

  public void setName(String newName) {
    this.name = newName;
  }
  protected String getName() {
    return name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
