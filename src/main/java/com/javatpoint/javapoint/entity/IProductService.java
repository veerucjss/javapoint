package com.javatpoint.javapoint.entity;

import com.javatpoint.javapoint.model.Product;

import java.util.List;
public interface IProductService
{
    List<Product> findAll();
}