package com.example.mc1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int proId;
    private String proName;
    private String proBrand;
    private int proPrice;
    public Product(){

    }

    public Product(int proId, String proName, String proBrand, int proPrice) {
        this.proId = proId;
        this.proName = proName;
        this.proBrand = proBrand;
        this.proPrice = proPrice;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProBrand() {
        return proBrand;
    }

    public void setProBrand(String proBrand) {
        this.proBrand = proBrand;
    }

    public int getProPrice() {
        return proPrice;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proBrand='" + proBrand + '\'' +
                ", proPrice=" + proPrice +
                '}';
    }
}
