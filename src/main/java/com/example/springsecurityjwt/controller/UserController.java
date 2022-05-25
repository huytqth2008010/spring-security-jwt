package com.example.springsecurityjwt.controller;

import com.example.springsecurityjwt.entity.Article;
import com.example.springsecurityjwt.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private static ArrayList<Article> articles;

    static {
        articles = new ArrayList<>();
        articles.add(new Article(1,"Articles name 1","Articles title 1", 1));
        articles.add(new Article(2,"Articles name 2","Articles title 2", 1));
        articles.add(new Article(3,"Articles name 3","Articles title 3", 1));
        articles.add(new Article(4,"Articles name 4","Articles title 4", 1));
    }

    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public ResponseEntity<List<Article>> helloAdmin() {
        return ResponseEntity.ok(articles);
    }
}
