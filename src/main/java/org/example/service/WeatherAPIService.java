package org.example.service;

import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.*;

@Service
public class WeatherAPIService {

    public String getForecastSummary(String city, String clientSecret) throws Exception {
        String apiUrl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/" + city + "/summary";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .header("X-RapidAPI-Key", clientSecret)
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    public String getHourlyForecast(String city, String clientSecret) throws Exception {
        String apiUrl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/" + city + "/hourly";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .header("X-RapidAPI-Key", clientSecret)
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}


