package model;

public class Dog extends Animal{
  protected String breed;
  protected String gender;

  public Dog(int paws, String type, String breed, String gender) {
    super(paws, type);
    this.breed = breed;
    this.gender = gender;
  }
}
