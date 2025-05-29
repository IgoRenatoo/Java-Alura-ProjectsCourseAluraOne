package model;

import Error.ErrorConsultation;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
public class SearchGithub {
  protected String userGithub;

  public SearchGithub() throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome do usuário desejado: ");
    userGithub = scanner.nextLine();

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.github.com/search/users?q=" + userGithub))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson = new Gson();

    ResponseApi responseApi = gson.fromJson(response.body(), ResponseApi.class);
    try {
      if(responseApi.items != null && responseApi.items.length > 0){
        System.out.println("Usuários encontrados: " + responseApi.items.length);
        for (UserApi item : responseApi.items) {
          System.out.println("Usuário encontrado: " + item.login);
          System.out.println("ID do Usuário: " + item.id);
          System.out.println("URL do Usuário: " + item.html_url);
          System.out.println("");
          System.out.println("");
          System.out.println("------------------------");
        }
      } else {
        throw new ErrorConsultation("Nome de usuário não encontrado!");
      }
    } catch (ErrorConsultation e) {
      System.out.println("Falha na pesquisa. " + e.getMessage());
    }
  }
}
