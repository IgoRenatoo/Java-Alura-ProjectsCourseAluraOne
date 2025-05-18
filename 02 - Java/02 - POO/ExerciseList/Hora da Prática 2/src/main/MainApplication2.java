/*
Exercício 1 - Hortifruti

- Crie uma classe Produto com atributos como nome, preço, e quantidade.
- Crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione produtos, imprima o tamanho da lista e recupere um produto pelo índice.
- Implemente o méthodo toString() na classe Produto para retornar uma representação em texto do objeto.
- Imprima a lista de produtos utilizando o méthodo System.out.println().
- Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
- Crie objetos Produto utilizando esse novo construtor.
- Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.
*/
package main;

import model.Produto2;
import model.ProdutoPerecivel;

import java.util.ArrayList;
public class MainApplication2 {
  public static void main(String[] args) {
    ArrayList<Produto2> produtos = new ArrayList<>();
    ArrayList<ProdutoPerecivel> produtosPerecivel = new ArrayList<>();

    produtos.add(new Produto2("Banana", 4.99, 12));
    produtos.add(new Produto2("Maça", 7.99, 8));
    produtos.add(new Produto2("Pêra", 11.20, 3));
    produtos.add(new Produto2("Mamão", 5.50, 7));
    produtos.add(new Produto2("Melancia", 11.20, 9));

    produtosPerecivel.add(new ProdutoPerecivel("Lasanha", 18.99, 4,90));

    System.out.println("O tamanho da lista atualmente é de: " + produtos.size() + "un.");
    System.out.println("O produto de índice 3 é: " + produtos.get(3));
    System.out.println(produtos.getFirst()); // Méthodo sobrescrito...

    System.out.println("-------------------------");
    for (int i = 0; i < produtos.size(); i++){
      System.out.println("Produto " + i + ": " + produtos.get(i));
    }
    System.out.println("-------------------------");
    System.out.println("Perecíveis!");
    for (int i = 0; i < produtosPerecivel.size(); i++){
      System.out.println("Produto " + i + ": " + produtosPerecivel.get(i) + ", Dias para vencimento: " + produtosPerecivel.get(i).validity + "d");
    }
  }
}
