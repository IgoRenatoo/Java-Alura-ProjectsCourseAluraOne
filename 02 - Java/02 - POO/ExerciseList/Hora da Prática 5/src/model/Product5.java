package model;

public class Product5 implements Comparable<Product5>{
  private String name;
  private Double price;

  public Product5(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return this.name;
  }

  @Override
  public int compareTo(Product5 currentProduct) {
    return this.price.compareTo(currentProduct.price);
  }
}
