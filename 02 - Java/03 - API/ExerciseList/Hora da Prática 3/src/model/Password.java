package model;

import java.util.Scanner;
public class Password {
  protected String password;

  public Password() {
    Scanner scanner = new Scanner(System.in);
    do {
      try {
        if(password != null){
          throw new Exception("Você digitou uma senha menor que 4 dígitos.");
        }
        System.out.println("Sua senha deve conter 4 dígitos!");
        password = scanner.nextLine();
      } catch (Exception e) {
        password = null;
        System.out.println(e.getMessage());
      }
    } while (password == null || password.length() < 4);
    System.out.println("Password registrado com sucesso!");
  }
}
