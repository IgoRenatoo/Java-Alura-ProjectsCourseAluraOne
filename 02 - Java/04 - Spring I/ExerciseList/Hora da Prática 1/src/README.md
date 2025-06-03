# 🏆 Lista de Exercícios

## 🔰 Iniciante

#### *Exercício 1*

- [] Crie um novo projeto com Spring Boot, usando o site start.spring.io. Esse projeto será o contador, e funcionará na linha de comando. Você deve pedir para um usuário digitar um número e depois imprimir na tela uma contagem de 1 até o número digitado pelo usuário.

Por exemplo, se o usuário digitar 5, deve aparecer no terminal 1 2 3 4 5 .

- [] Suponha que decidimos mudar de ideia e utilizar novamente a biblioteca Gson no nosso projeto ScreenMatch. Agora que estamos trabalhando com o Maven, os passos para adicionar a biblioteca são diferentes do que já foi feito antes. Explique quais passos você iria realizar nesse caso.

- [] Lembre-se: serializar um objeto é conseguir representá-lo de alguma forma em um arquivo. Aqui, você deve instanciar um objeto do tipo Tarefa e fazer com que o conteúdo do objeto vá para o arquivo tarefa.json. Para isso, utilize o Jackson para te auxiliar na tarefa. Observação: para criar novos arquivos, podemos utilizar new File("tarefa.json").

- [] Agora, você fará o oposto da atividade anterior: a desserialização de um arquivo, que é ler os valores de um arquivo específico e transformar em um objeto. Leia o conteúdo do arquivo tarefa.json, produzido no exercício anterior, e o transforme em um objeto do tipo Tarefa. Exiba o conteúdo do objeto na tela.

- [] Vamos criar objetos genéricos. Imagine que você trabalha em um site que oferece várias coisas: venda de produtos, serviços de instalação desses produtos e assinatura de alguns itens. Todas essas coisas têm algo em comum: podem ser avaliadas pelos consumidores. Crie uma classe genérica de Avaliação, de modo que possamos ter, por exemplo: Avaliacao<Servico>, Avaliacao<Produto> e Avaliacao<Assinatura>. Essa classe deve ter o item genérico de avaliação, a nota e um comentário sobre a nota.