package com.example.springbootcrudwithsplunkintegration.controller;

import com.example.springbootcrudwithsplunkintegration.entity.Product;
import com.example.springbootcrudwithsplunkintegration.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    Logger logger = LogManager.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping
    public List<Product> findAll() {
        logger.info("started hiting the findall api from controller");
        List<Product> productList = productService.findAll();
        logger.info("fetched all products  from service in controller" +productList);
        return productList;
    }


    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        logger.info("started hiting the find by ID api from controller {} "+id);
        return productService.findById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        logger.info("started execution save() api from controller {}"+product);
        return productService.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        logger.info("started executing update api from controller {}"+product);
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        logger.info("started delete by ID api from controller {}"+id);
        productService.deleteById(id);
    }


}

