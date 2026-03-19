package com.example.stocktracker.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {

    // English: This method takes a symbol (like IBM) and returns live data from the internet.
    // Hindi: यह मेथड एक सिंबल (जैसे IBM) लेता है और इंटरनेट से लाइव डेटा वापस लाता है।
    public String getLivePrice(String symbol) {
        
        // This is a Free Demo API URL
        String url = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + symbol + "&apikey=demo";
        
        // RestTemplate is like a "Postman" inside Java code
        RestTemplate restTemplate = new RestTemplate();
        
        // Fetching data as a String
        return restTemplate.getForObject(url, String.class);
    }
}