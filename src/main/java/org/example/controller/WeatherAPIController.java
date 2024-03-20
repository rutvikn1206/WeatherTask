package org.example.controller;

import org.example.service.WeatherAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/weather")
public class WeatherAPIController {

    @Autowired
    WeatherAPIService weatherAPIService;

    @GetMapping("/summary")
    public ResponseEntity<Object> getForecastSummary(@RequestParam String city,
                                                     @RequestHeader("client-id") String clientId,
                                                     @RequestHeader("client-secret") String clientSecret) {
        try {
            String summary = weatherAPIService.getForecastSummary(city, clientSecret);
            return ResponseEntity.ok(summary);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }

    @GetMapping("/hourly")
    public ResponseEntity<Object> getHourlyForecast(@RequestParam String city,
                                                    @RequestHeader("client-id") String clientId,
                                                    @RequestHeader("client-secret") String clientSecret) {
        try {
            String hourlyForecast = weatherAPIService.getHourlyForecast(city, clientSecret);
            return ResponseEntity.ok(hourlyForecast);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }
}

