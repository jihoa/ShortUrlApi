package com.example.demo.controller;


import com.example.demo.service.ShortUrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShortUrlController {

    @Value("${around.hub.short.url.id}")
    private String CLIENT_ID;

    @Value("${around.hub.short.url.secret}")
    private String CLIENT_SECRET;

    private final ShortUrlService shortUrlService;


    //method

    //generateShorUrl(String url)
    //getShortUrl(String url)
    //deleteShorUrl(String url)
}
