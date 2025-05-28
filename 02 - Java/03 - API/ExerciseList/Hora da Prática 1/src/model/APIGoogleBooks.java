package model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class APIGoogleBooks {
  private final HttpClient client = HttpClient.newHttpClient();

  public String searchBook(String nameBook) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=intitle:" + nameBook))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    return response.body();
  }
}
