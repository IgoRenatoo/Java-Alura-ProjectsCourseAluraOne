# 🏆 Lista de Exercícios

## 🔰 Iniciante

#### *Exercício 4*

- [x] Dada a lista de números inteiros `List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);`, encontre o **maior número** dela utilizando `Stream`.


- [x] Dada a lista de palavras `List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");`, **agrupá-las por tamanho** em um `Map<Integer, List<String>>`.


* [x] Dada a lista de nomes `List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");`, **concatene-os separados por vírgula**. Resultado esperado: `"Alice, Bob, Charlie"`.


* [x] Dada a lista de números `List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);`, **calcule a soma dos quadrados dos números pares** utilizando `Stream`.


* [x] Dada a lista `List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);`, **separe os números pares dos ímpares** em um `Map<Boolean, List<Integer>>` usando `partitioningBy`.


* [ ] Dada a lista de produtos, **filtre todos os produtos da categoria "Eletrônicos" com preço menor que R\$ 1000**, ordene pelo preço em ordem crescente e colete o resultado em uma nova lista. 
  * Use como base a classe `Produto`:  Cada produto possui os atributos nome (String), preco (double) e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.


* [ ] A partir do exercício anterior, **modifique o código para que a saída mostre apenas os três produtos mais baratos** da categoria "Eletrônicos".


* [ ] Dada a lista de produtos, **agrupe-os por categoria** em um `Map<String, List<Produto>>`.


* [ ] Dada a lista de produtos, **conte quantos produtos há em cada categoria** e armazene em um `Map<String, Long>`.


* [ ] Dada a lista de produtos, **encontre o produto mais caro de cada categoria** e armazene o resultado em um `Map<String, Optional<Produto>>`.


* [ ] Dada a lista de produtos, **calcule o total dos preços dos produtos em cada categoria** e armazene em um `Map<String, Double>`.
