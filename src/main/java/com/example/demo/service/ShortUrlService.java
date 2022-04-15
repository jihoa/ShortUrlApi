package com.example.demo.service;

public interface ShortUrlService {

    void generateShortUrl(String clientId, String clientSecret, String originalUrl);
    //naver API로  shortUrl 요청 및 리턴, DB 저장 (DTO -> Entity)

    void getShortUrl(String clientId, String clientSecret, String originalUrl);
    // DB조회 후 shortUrl 리턴, DB 값 없다면 generateShortUrl 
    
    void deleteShortUrl(String clientId, String clientSecret, String originalUrl);
}
