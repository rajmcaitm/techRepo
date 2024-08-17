package com.example.springbootcrudwithsplunkintegration.service;


import com.example.springbootcrudwithsplunkintegration.entity.Product;
import com.example.springbootcrudwithsplunkintegration.repo.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    Logger logger  = LogManager.getLogger(ProductService.class);
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        logger.info("we are starting the execution of findAll  () in service ");
        List<Product>  productsList = productRepository.findAll();
        logger.info("fetched the product list from db  in service {} " +productsList);
        return productsList;
    }

    public Optional<Product> findById(Long id) {
        logger.info("fetching the product list from db  in service {} " +id);
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        logger.info("saving the product from into db  in service {} " +product);
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        logger.info("deleting the product by ID from db  in service {} " +id);
        productRepository.deleteById(id);
    }





}

