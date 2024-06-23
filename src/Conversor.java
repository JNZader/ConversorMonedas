import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {

   public Double convertirValor(String base,
                                String target,
                                Double valor) {
      URI direccion = URI.create("https://v6.exchangerate-api" +
            ".com/v6/8f80fcf16fad4ec6a8defb06/pair/" + base + "/" + target + "/" + valor);

      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();

      try {
         HttpResponse<String> response = client
               .send(request, HttpResponse.BodyHandlers.ofString());

         CambioMoneda cambioMoneda = new Gson().fromJson(response.body(), CambioMoneda.class);

         return cambioMoneda.conversion_result();
      } catch (Exception e) {
         throw new RuntimeException("no se pudo convertir de una moneda a otra");
      }
   }

   public void mostrarConversion(String base, String target){

      double valor=obtenerValorDouble();
      double resultado=convertirValor(base,target,valor);
      System.out.println("El valor "+valor+base+" corresponde al valor final de => "+resultado+target);


   }

   public static double obtenerValorDouble() {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingrese el valor a convertir: ");

      while (!scanner.hasNextDouble()) {
         System.out.println("Entrada no válida. Por favor, ingrese un número positivo, en caso de" +
               " tener decimales separarlos por un punto");
         scanner.next();
      }

      double num = scanner.nextDouble();
      return num;
   }

}
