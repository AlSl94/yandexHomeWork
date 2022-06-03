package ru.yandex.Sprint.Sprint7.Lesson_2_4_1;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

class Post {
    private int id;
    private String text;
    private List<Comment> commentaries = new ArrayList<>();

    private Post() {
    }

    public Post(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public void addComment(Comment comment) {
        commentaries.add(comment);
    }

    public int getId() {
        return id;
    }
}

class Comment {
    private String user;
    private String text;

    private Comment() {}

    public Comment(String user, String text) {
        this.user = user;
        this.text = text;
    }
}

public class Practicum {
    private static final int PORT = 8080;
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    private static Gson gson = new Gson();
    private static List<Post> posts = new ArrayList<>();

    static {
        Post post1 = new Post(1, "Это первый пост, который я здесь написал.");
        post1.addComment(new Comment("Пётр Первый", "Я успел откомментировать первым!"));
        posts.add(post1);

        Post post2 = new Post(22, "Это будет второй пост. Тоже короткий.");
        posts.add(post2);

        Post post3 = new Post(333, "Это пока последний пост.");
        posts.add(post3);
    }

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();
        // тут конфигурирование и запуск сервера

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/posts", new PostsHandler());
        httpServer.start();

        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(1);
    }

    static class PostsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String path = httpExchange.getRequestURI().getPath(); // Получение первого эндпоинта
            String requestMethod = httpExchange.getRequestMethod(); // Получение второго-третьего эндпоинтов


            if (path.endsWith("/posts/") || path.endsWith("/posts") && requestMethod.equals("GET")) {
                String postJson = gson.toJson(posts);
                httpExchange.sendResponseHeaders(200, 0);
                try (OutputStream os = httpExchange.getResponseBody()) {
                    os.write(postJson.getBytes(DEFAULT_CHARSET));
                }

                //Get with comment
            } else if (path.contains("/comments") && requestMethod.equals("GET")) {
                int id = Integer.parseInt(path.split("/")[2]);

                if (posts.stream().anyMatch(post -> post.getId() == id)) {

                    Post rightPost = posts.stream()
                            .filter(post -> post.getId() == id)
                            .findFirst().get();

                    String jsonPost = gson.toJson(rightPost);

                    httpExchange.sendResponseHeaders(200, 0);
                    try (OutputStream os = httpExchange.getResponseBody()) {
                        os.write(jsonPost.getBytes(DEFAULT_CHARSET));
                    }
                } else {
                    httpExchange.sendResponseHeaders(404, 0);
                    OutputStream os = httpExchange.getResponseBody();
                    os.close();
                }

            } else if (requestMethod.equals("POST")) {
                int id = Integer.parseInt(path.split("/")[2]);

                if (posts.stream().anyMatch(post -> post.getId() == id)) {

                    InputStream inputStream = httpExchange.getRequestBody();
                    String body = new String(inputStream.readAllBytes(), DEFAULT_CHARSET);

                    Comment comment = gson.fromJson(body, Comment.class);

                    Post post = posts.stream()
                            .filter(p -> p.getId() == id)
                            .findFirst().get();
                    post.addComment(comment);

                    httpExchange.sendResponseHeaders(201, 0);
                    OutputStream os = httpExchange.getResponseBody();
                    os.close();
                } else {
                    httpExchange.sendResponseHeaders(404, 0);
                    OutputStream os = httpExchange.getResponseBody();
                    os.close();
                }
            }
        }
    }
}