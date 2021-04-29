package com.api.cnv.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.api.cnv.repository.ProductRepository;
import com.api.cnv.vo.ProductVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;


    public List<ProductVo> findAll(){
        List<ProductVo> products = new ArrayList<>();
        productRepository.findAll().forEach(e -> products.add(e));
        return products;
        
    }

    public Optional<ProductVo> findByName(String name){
        Optional<ProductVo> product = productRepository.findByName(name);
        return product;
    }
}
