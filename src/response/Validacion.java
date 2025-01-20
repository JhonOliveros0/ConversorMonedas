package response;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Scanner;


public class Validacion {
    private static String URL = "https://v6.exchangerate-api.com/v6/fa20340477f0f5016b647d4b/latest/USD";
    public static void mostrarMenu() {
        int option = 0;
        double amount= 0.0;
        Scanner sc = new Scanner(System.in);
        do{


            System.out.println("Bienvenido al conversor de moneda, digite el monto a convertir:/n");
            System.out.println("Bienvenido al conversor de moneda, digite el monto a convertir:");
            amount = sc.nextInt();
            System.out.println("a que moneda desea convertir:");
            System.out.println("1. Dolar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dolar");
            System.out.println("3. Dolar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dolar");
            System.out.println("5. Dolar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dolar");
            System.out.println("7. Salir");



            option= sc.nextInt();
            switch (option){
                case 1:
                    convertirMoneda("USD",amount);
                    break;
                case 2:
                    URL = "https://v6.exchangerate-api.com/v6/fa20340477f0f5016b647d4b/latest/ARS";
                    convertirMoneda("ARS",amount);
                    break;
                case 3:
                    convertirMoneda("BRL",amount);
                    break;
                case 4:
                    convertirMoneda("USD", amount);
                    URL = "https://v6.exchangerate-api.com/v6/fa20340477f0f5016b647d4b/latest/BRL";
                    break;
                case 5:
                    convertirMoneda("COP", amount);
                    break;
                case 6:
                    convertirMoneda("USD", amount);
                    URL = "https://v6.exchangerate-api.com/v6/fa20340477f0f5016b647d4b/latest/COP";
                    break;
                case 7:
                    System.out.println("Saliendo del Sistema");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while(option!=7);
    }
    private static void convertirMoneda(String currency, Double amount) {
        ClientResponseJson response = consumirApi();
        Double value = response.getConversion_rates().get(currency);
        if(Objects.isNull(value)){
            System.out.printf("El valor de la Moneda %s no esta dispoible", currency);
        }else {

            System.out.printf("El valor de la Moneda %s es %s%n", currency, value*amount);
        }
    }

    private static ClientResponseJson consumirApi() {
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpRequest request = HttpRequest.newBuilder().GET().uri(new URI(URL)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), ClientResponseJson.class);
        }catch (URISyntaxException e){
            System.out.println("Url no reconocida, error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("error al consumir el servicio: "+e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Pconezion interrumpida, error: "+e.getMessage());
        }
        return null;
    }

}
