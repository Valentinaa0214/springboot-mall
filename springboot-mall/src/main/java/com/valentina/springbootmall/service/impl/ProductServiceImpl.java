package com.valentina.springbootmall.service.impl;

import com.valentina.springbootmall.dao.ProductDao;
import com.valentina.springbootmall.model.Product;
import com.valentina.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
