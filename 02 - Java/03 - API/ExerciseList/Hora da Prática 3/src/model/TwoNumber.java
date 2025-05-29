package model;

import java.util.Scanner;

public class TwoNumber {
  protected int num1;
  protected int num2;
  protected int result;

  public TwoNumber() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o primeiro número da divisão:");
    num1 = scanner.nextInt();

    System.out.println("Informe o segundo número da divisão:");
    num2 = scanner.nextInt();

    try {
      if (num2 == 0) {
        throw new Exception("Divisão por 0 não existe!");
      }
      result = num1 / num2;
      System.out.println("O resultado da divisão é: " + result);
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    } finally {
      System.out.println("Operação finalizada!");
    }
  }
}
