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
package model;

public class ProdutoPerecivel extends Produto{
  public double validity;

  public ProdutoPerecivel(String name, double price, int quantity, double validity) {
    super(name, price, quantity);
    this.validity = validity;
  }
}
