package com.ecommerce.Ecommerce.model;

import javax.persistence.*;

@Entity
@Table
public class Desktop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type; //game or work
    private String brand;
    private String ram;
    private String cpu;
    private String gpu;
    private String ssd;
    private String os;
    private String code;
    private String price;
    private String description;

    public Desktop() {
    }

    public Desktop(Long id,String type, String brand, String ram, String cpu, String gpu, String ssd, String os, String code, String price, String description) {
        this.id=id;
        this.type = type;
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ssd = ssd;
        this.os = os;
        this.code = code;
        this.price = price;
        this.description = description;
    }

    public Desktop(String type, String brand, String ram, String cpu, String gpu, String ssd, String os, String code, String price, String description) {
        this.type = type;
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ssd = ssd;
        this.os = os;
        this.code = code;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
