package com.t1908e.springbootwshost.service;

import com.t1908e.springbootwshost.entity.Product;
import com.t1908e.springbootwshost.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Optional;

@WebService
@Component(value = "productService")
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @WebMethod
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @WebMethod
    public void addProduct(Product p){
        productRepository.save(p);
    }

    @WebMethod
    public void sellProduct(int productId, int quantity){
        Optional<Product> currentProduct = productRepository.findById(productId);
        Product product = currentProduct.get();
        product.setQuantity(product.getQuantity() - quantity);
        productRepository.save(product);
    }
}
