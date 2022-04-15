package com.example.demo.dao;

import com.example.demo.entity.ShortUrlEntity;

public interface ShortUrlDAO {

    void saveShortUrl(ShortUrlEntity shortUrlEntity);
    //repository로 entity 객체를 넘겨 DB 저장

    void getShorUrl(String originalUrl);
    //DB조회 후 shortUrl 리턴

}
