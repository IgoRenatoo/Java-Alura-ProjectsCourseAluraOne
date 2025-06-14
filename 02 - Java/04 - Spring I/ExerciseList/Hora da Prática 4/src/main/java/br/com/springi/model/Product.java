package br.com.springi.model;

public class Product {
  private String name;
  private String type;
  private double price;

  public Product(String name, String type, double price) {
    this.name = name;
    this.type = type;
    this.price = price;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "Product Name= '" + name + "', Price= " + price;
  }
}
