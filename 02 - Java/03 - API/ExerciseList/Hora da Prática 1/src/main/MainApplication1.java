package main;

import model.APIGoogleBooks;

import java.io.IOException;
import java.util.Scanner;
public class MainApplication1 {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome do book desejado!");
    String book = scanner.nextLine();

    APIGoogleBooks newSearch = new APIGoogleBooks();

    System.out.println(newSearch.searchBook(book));
  }
}
