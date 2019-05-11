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
        laptop.setPrice("7000 TL");
        laptopService.addLaptop(laptop);
        Laptop laptop2=new Laptop();
        laptop2.setBrand("Dell");
        laptop2.setCode("Dell 7567");
        laptop2.setCpu("i7-7700hq");
        laptop2.setGpu("1050 Ti");
        laptop2.setOs("Windows 10");
        laptop2.setRam("16 GB DDR4 2400 MH");
        laptop2.setSsd("128 GB");
        laptop2.setType("Gamebook");
        laptop2.setPrice("6900 TL");
        laptopService.addLaptop(laptop2);

    }
}
