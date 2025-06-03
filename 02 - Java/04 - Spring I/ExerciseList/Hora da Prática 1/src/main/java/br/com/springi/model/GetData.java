package br.com.springi.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class GetData {
  private final String URL;

  public GetData(String URL) {
    this.URL = URL;
  }
  public String fetchData() throws IOException, InterruptedException {
    try {
      HttpClient client = HttpClient.newHttpClient();

      HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(URL))
              .build();

      HttpResponse<String> response = client
              .send(request, HttpResponse.BodyHandlers.ofString());

      return response.body();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
