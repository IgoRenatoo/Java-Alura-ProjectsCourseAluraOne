package model;

public class Product2 implements Calculate {
  protected String name;
  public String type;
  public double price;
  protected double height;
  protected double width;

  public Product2(String name, String type, double price, double height, double width) {
    this.name = name;
    this.type = type;
    this.price = price;
    this.height = height;
    this.width = width;
  }

  @Override
  public double calculateArea() {
    if (type.equals("Círculo")){
      return Math.PI*this.width*this.width;
    } else {
      return width*height;
    }
  }
}
