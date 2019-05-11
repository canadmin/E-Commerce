package com.ecommerce.Ecommerce.boostrap;

import com.ecommerce.Ecommerce.model.Category;
import com.ecommerce.Ecommerce.model.Laptop;
import com.ecommerce.Ecommerce.model.Product;
import com.ecommerce.Ecommerce.service.LaptopService;
import com.ecommerce.Ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductService productService;
    private LaptopService laptopService;



    public DataLoader(ProductService productService, LaptopService laptopService) {
        this.productService = productService;
        this.laptopService = laptopService;
    }

    @Override
    public void run(String... args) throws Exception {
        Product product=new Product();

        Category category=new Category();
        category.setCategoryName("bilgisayar");
        product.setCategory(category);
        product.setProductName("Asus k55-vd");
        productService.addProduct(product);

        Laptop laptop=new Laptop();
        laptop.setBrand("Asus");
        laptop.setCode("Asus k55-vd");
        laptop.setCpu("i9-9900hq");
        laptop.setGpu("1050 Ti");
        laptop.setOs("Windows 10");
        laptop.setRam("16 GB DDR4 2400 MH");
        laptop.setSsd("128 GB");
        laptop.setType("Gamebook");
        laptopService.addLaptop(laptop);
    }
}
