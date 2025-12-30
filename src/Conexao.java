import com.google.gson.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conexao {
    // classe para mexer especificamente com as requisições http

    public double getTaxaDeConversao(String url){
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // a resposta da API tem que ser coletada dentro de try-catch
        try {
            // resposta da API
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // conversão para JSON
            JsonElement element = JsonParser.parseString(response.body());
            JsonObject object = element.getAsJsonObject();

            // extraindo a taxa de conversão do JSON retornado da API
            double taxa = object.get("conversion_rate").getAsDouble();

            return taxa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
