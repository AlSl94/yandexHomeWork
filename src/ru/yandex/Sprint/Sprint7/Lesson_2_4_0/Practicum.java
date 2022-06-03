package ru.yandex.Sprint.Sprint7.Lesson_2_4_0;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class Practicum {
    private static final int PORT = 8080;
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(1);
    }

    static class HelloHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String response = "";

            // извлеките метод из запроса
            String method = httpExchange.getRequestMethod();
            System.out.println("Началась обработка " + method + " /hello запроса от клиента.");

            switch(method) {
                // сформируйте ответ в случае, если был вызван POST-метод
                case "POST":
                    // извлеките тело запроса
                    InputStream inputStream = httpExchange.getRequestBody();
                    String body = new String(inputStream.readAllBytes(), DEFAULT_CHARSET);
                    System.out.println("Тело запроса:\n" + body);

                    // извлеките path из запроса
                    String path = httpExchange.getRequestURI().getPath();

                    // а из path — профессию и имя
                    String profession = path.split("/")[2];
                    String name = path.split("/")[3];

                    Headers header = httpExchange.getRequestHeaders();
                    System.out.println("Заголовки запроса: " + header.entrySet());
                    // извлеките заголовок
                    List<String> wishGoodDay = header.get("X-Wish-Good-Day");
                    if (wishGoodDay.contains("true")) {
                        response = body + ", " + profession + " " + name + "! Хорошего дня!";
                    } else response = body + ", " + profession + " " + name + "!";
                    // соберите ответ
                    break;
                    // не забудьте про ответ для остальных методов
                case "GET":
                    response = "Здравствуйте";
                    break;
                default:
                    response = "Вы использовали какой-то другой метод!";
            }

            httpExchange.sendResponseHeaders(200, 0);
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}