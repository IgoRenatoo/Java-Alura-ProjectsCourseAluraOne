package main;

import model.Product5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class MainApplication5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Product5> listProduct = new ArrayList<>();

    System.out.println("Informe o limite do cartão: ");
    double balance = scanner.nextInt();

    while (balance > 0) {
      try {
        System.out.println("***  Digite 1 para uma nova compra ou 2 para encerrar pedido.   ***");
        int order = scanner.nextInt();
        if(order == 1){
          System.out.println("Informe o nome do item: ");
          String name = scanner.next();
          System.out.println("Informe o valor do item: ");
          double price = scanner.nextInt();

          if (balance - price >= 0){
            listProduct.add(new Product5(name, price));
            balance-= price;
          } else {
            System.out.println("O valor do item é maior que o saldo do cartão, compra não realizada!");
            return;
          }
        } else {
          System.out.println("***  Compra finalizada!  ***");
        }
      } finally {
        Collections.sort(listProduct);
        System.out.println("Os itens do carrinho são: ");
        for (Product5 produto : listProduct) {
          System.out.println(produto.getName() + " - R$" + produto.getPrice());
        }
        System.out.println("O saldo do cartão atual é de: " + balance + " reais.");
      }
    }
  }
}
