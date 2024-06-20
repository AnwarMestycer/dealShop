package com.ads.deal_shop.repository; 

import com.ads.deal_shop.model.Product;

import org.springframework.data.repository.CrudRepository;
public interface ProductRepository extends CrudRepository<Product, Integer> { 

}  