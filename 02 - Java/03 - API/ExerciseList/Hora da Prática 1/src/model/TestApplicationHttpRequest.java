package model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
public class TestApplicationHttpRequest {
  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println("Qual nome do filme desejado? ");
    Scanner scanner = new Scanner(System.in);

    var movie = scanner.nextLine();
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.omdbapi.com/?apikey=f8f1febd&t=" + movie))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println(response.body());
  }
}
