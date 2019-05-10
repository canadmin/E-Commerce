package com.ecommerce.Ecommerce.boostrap;

import com.ecommerce.Ecommerce.model.Product;
import com.ecommerce.Ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductService productService;

    //constructor injection
    public DataLoader(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        Product laptop=new Product();
        laptop.setProductName("Asus");
        laptop.setProductCategory("Laptop");
        laptop.setProductDescription("Asus Rog serisi gamer laptop");
        laptop.setProductPrice("7500 Tl");

        boolean test= productService.addProduct(laptop);
        if(test){
            System.out.println("başarılı");
        }

    }
}
