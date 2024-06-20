package com.ads.deal_shop.controller;

import com.ads.deal_shop.model.Product;

import com.ads.deal_shop.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping(value = "/product")

public class ProductController {

 

  @Autowired

  private ProductService productService;

 

  @PostMapping(value = "/add")

  public void addProduct(@RequestBody Product product) {

    productService.addProduct(product);

  }
  
  @GetMapping(value="/load-product/{productId}")
  public @ResponseBody Product loadById (@PathVariable("productId") int productId)  {

    return productService.loadById (productId);

  }

}