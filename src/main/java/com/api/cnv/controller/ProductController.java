package com.api.cnv.controller;

import java.util.List;
import java.util.Optional;

import com.api.cnv.service.ProductService;
import com.api.cnv.vo.ProductVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    
    @Autowired
    ProductService productService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ProductVo>> getAllProducts(){
        List<ProductVo> products = productService.findAll();
        return new ResponseEntity<List<ProductVo>>(products, HttpStatus.OK);
    }

    @GetMapping(value = "/{name}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ProductVo> getProduct(@PathVariable String name){
        Optional<ProductVo> products = productService.findByName(name);
        return new ResponseEntity<ProductVo>(products.get(), HttpStatus.OK);
    }
}
