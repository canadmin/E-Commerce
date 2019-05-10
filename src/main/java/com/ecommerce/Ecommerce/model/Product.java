package com.ecommerce.Ecommerce.model;

import javax.persistence.*;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private String productPrice;
    private String productCategory;
    private String productDescription;

    //get constructor
    public Product(Long id, String productName, String productPrice, String productCategory, String productDescription) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
    }

    // add constructer
    public Product(String productName, String productPrice, String productCategory, String productDescription) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
    }
    //default contructor

    public Product() {
        //default
    }

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
