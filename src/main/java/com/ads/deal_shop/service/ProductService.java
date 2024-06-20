package com.ads.deal_shop.service;

import com.ads.deal_shop.model.Product;

import com.ads.deal_shop.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service

public class ProductService { 

  @Autowired

  private ProductRepository productRepository;

     public void addProduct(Product product) {

      productRepository.save(product);
     }
     public Product loadById(int productId) {
    	   return productRepository.findById(productId).get();

    	}
  }