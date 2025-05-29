package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Titulo;
import model.WriterFile;

import java.util.Scanner;
public class MainApplicationAPI4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva a mensagem desejada para salvar no arquivo.txt: ");
    String newMessage = scanner.nextLine();

    WriterFile newWriter = new WriterFile(newMessage);

    Titulo titulo = new Titulo("Aventuras de Java", "Igor Oliveira", 2025);

    // Usa GsonBuilder com setPrettyPrinting
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    String jsonFormatado = gson.toJson(titulo);

    System.out.println(jsonFormatado);
  }
}
