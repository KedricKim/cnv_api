package com.api.cnv.repository;

import java.util.Optional;

import com.api.cnv.vo.ProductVo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductVo, Integer>{
    
    public Optional<ProductVo> findByName(String name);

}
