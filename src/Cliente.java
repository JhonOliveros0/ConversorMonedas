import com.google.gson.Gson;
import response.ClientResponseJson;
import response.Validacion;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Scanner;


public class Cliente {


    public static void main(String[] args) {
        Validacion.mostrarMenu();
    }

}
