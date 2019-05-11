package com.ecommerce.Ecommerce.model;

import javax.persistence.*;

@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoryName;
    @OneToOne(mappedBy = "category", cascade = CascadeType.ALL)
    private Product product; // umarım jenerik sınıf sorunu çözer

    public Category(Long id, String categoryName, Product products) {
        this.id = id;
        this.categoryName = categoryName;
        this.product = products;
    }

    public Category(String categoryName, Product  products) {
        this.categoryName = categoryName;
        this.product = products;
    }

    public Category() {
    }

    public Product getProducts() {
        return product;
    }

    public void setProducts(Product products) {
        this.product = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
