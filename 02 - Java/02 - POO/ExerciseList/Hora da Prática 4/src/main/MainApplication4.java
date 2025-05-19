package main;

import model.TitleApplication4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class MainApplication4 {
  public static void main(String[] args) {
    // Tarefa 1
    System.out.println("** Tarefa 1 **");
    List<Integer> numbers = new LinkedList<>();

    numbers.add(4);
    numbers.add(7);
    numbers.add(1);
    numbers.add(5);

    Collections.sort(numbers);
    for (int current : numbers){
      System.out.println(current);
    }
    System.out.println("** ----------------- **");

    // Tarefa 2
    System.out.println("** Tarefa 2,3 e 5 **");

    List<TitleApplication4> listNames = new ArrayList<>();
    /*List<TitleApplication4> listNames = new LinkedList<>();*/

    TitleApplication4 joana = new TitleApplication4("Joana");
    TitleApplication4 arthur = new TitleApplication4("Arthur");
    TitleApplication4 emili = new TitleApplication4("Emili");
    TitleApplication4 barbara = new TitleApplication4("Barbara");

    listNames.add(joana);
    listNames.add(arthur);
    listNames.add(emili);
    listNames.add(barbara);

    Collections.sort(listNames);

    for (TitleApplication4 name : listNames) {
      System.out.println(name.name);
    }
  }
}
