package main;

import model.Animal;
import model.Dog;
import model.Product2;

import java.util.ArrayList;
public class MainApplication3 {
  public static void main(String[] args) {
    // Primeira etapa do Exercício
    // Instanciamento do Array 'lista'
    ArrayList<String> lista = new ArrayList<>();

    // Criação dos objetos para popular 'lista'
    var tchovi = new Dog(4, "Cachorro", "Chow-Chow", "Macho");
    var hulk = new Dog(4, "Cachorro", "Chow-Chow", "Macho");
    tchovi.setName("Tchovi");
    hulk.setName("Hulk");

    // Casting para mostrar que independete do objeto a referência é a mesma na memória do sistema
    if (tchovi instanceof Animal){
      Animal newBento = tchovi;
      newBento.setName("NewTchovi");
    }

    // Adição dos objetos no array criado
    lista.add(tchovi.toString());
    lista.add(hulk.toString());

    // ForEach para exibir objetos populados no array
    for(String name: lista){
      System.out.println(name);
    }
    // -------------------------------------------------
    System.out.println("-------------------------------------------------");
    System.out.println("-------------------------------------------------");
    // Segunda etapa do Exercício
    double totalPrice = 0;
    int count = 0;
    ArrayList<Product2> lista2 = new ArrayList<>();

    lista2.add(new Product2("Esfera", "Círculo", 11.90, 50, 50));
    lista2.add(new Product2("Chapa", "Retangulo", 19.90, 30, 20));

    for (Product2 current: lista2){
      if(current.type.equals("Círculo")){
        System.out.println("A área do item " + count + " da lista é de: " + String.format("%.2f", current.calculateArea()) + " cm");
        count++;
      } else {
        System.out.println("A área do item " + count + " da lista é de: " + String.format("%.2f", current.calculateArea()) + " cm");
        count++;
      }
      totalPrice += current.price;
    }
    System.out.println("A média dos preços dos itens é de: " + String.format("%.2f", totalPrice/lista2.size()) + " reais.");
  }
}
