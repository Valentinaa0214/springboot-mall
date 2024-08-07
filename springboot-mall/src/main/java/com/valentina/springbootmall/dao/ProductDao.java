package com.valentina.springbootmall.dao;

import com.valentina.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
