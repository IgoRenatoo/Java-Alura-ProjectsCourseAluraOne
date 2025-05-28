package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class APIGoogleBooks {
  private final HttpClient client = HttpClient.newHttpClient();

  public void searchBook(String nameBook) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=intitle:" + nameBook))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson = new Gson();
    BookResponse bookResponse = gson.fromJson(response.body(), BookResponse.class);

    if (bookResponse.items != null && bookResponse.items.length > 0) {
      System.out.println("Itens encontrados:" + bookResponse.items.length);
      for (Item item: bookResponse.items) {
        System.out.println("📖 Título: " + item.volumeInfo.title);
        System.out.println("✍️ Autor(es): " + String.join(", ", item.volumeInfo.authors != null ? item.volumeInfo.authors : new String[]{"(Autor não informado)"}));
        System.out.println("📝 Descrição: " + (item.volumeInfo.description != null ? item.volumeInfo.description : "(Sem descrição)"));
        System.out.println("\uD83D\uDCC4 Editora: " + item.volumeInfo.publisher);
        System.out.println("📅 Publicado em: " + item.volumeInfo.publishedDate);
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------------------");
      }
      }
  }
}
