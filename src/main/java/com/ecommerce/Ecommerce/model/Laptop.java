package com.ecommerce.Ecommerce.model;


import javax.persistence.*;

@Entity
@Table
public class Laptop {

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

    //get constructor
    public Laptop(Long id, String type, String brand, String ram, String cpu, String gpu, String ssd, String os, String code) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ssd = ssd;
        this.os = os;
        this.code = code;
    }

    //set constructor

    public Laptop(String type, String brand, String ram, String cpu, String gpu, String ssd, String os, String code) {
        this.type = type;
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ssd = ssd;
        this.os = os;
        this.code = code;
    }

    public Laptop() {
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
}
