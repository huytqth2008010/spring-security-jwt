package com.example.springsecurityjwt.controller;

import com.example.springsecurityjwt.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/admin")
public class AdminController {

    private static ArrayList<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1,"product 01", 20, 1));
        products.add(new Product(2,"product 02", 21, 1));
        products.add(new Product(3,"product 03", 22, 1));
        products.add(new Product(4,"product 04", 23, 1));
        products.add(new Product(5,"product 05", 24, 1));
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> helloAdmin() {
        return ResponseEntity.ok(products);
    }
}
