package model;

import java.io.FileWriter;
import java.io.IOException;
public class WriterFile {
  protected static String message;
  protected static String path = "02 - Java/03 - API/ExerciseList/Hora da Prática 4/src/arquivo.txt";

  public WriterFile(String message) {
    this.message = message;

    try {
      FileWriter writer = new FileWriter(path);
      writer.write(message);
      writer.close();
      System.out.println("Arquivo escrito com sucesso.");
    } catch (IOException e) {
      e.getMessage();
    }
  }
}
