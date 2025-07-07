package com.vijay.java11;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11HttpClientExample {
	// Java 11 HttpClient API, which is a modern way to make HTTP calls (GET, POST, etc)
	// without relying on third-party libraries like Apache HttpClient or OkHttp.
    public static void main(String[] args) throws Exception {
        // Create a new HttpClient instance
        HttpClient client = HttpClient.newHttpClient();

        // Build an HTTP GET request
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .build();

        // Send the request and get the response as a String
        HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());

        // Print the response body
        System.out.println(res.body());
    }
}

