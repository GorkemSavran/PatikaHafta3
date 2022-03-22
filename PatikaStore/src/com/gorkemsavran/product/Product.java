package com.gorkemsavran.product;

import com.gorkemsavran.Brand;

public abstract class Product {
    private int id;
    private double price;
    private int discountRate;
    private int stock;
    private String name;
    private Brand brand;
    private int ram;
    private int diskSpace;
    private double screenSize;

    public Product(final int id,
                   final double price,
                   final int discountRate,
                   final int stock,
                   final String name,
                   final Brand brand,
                   final int ram,
                   final int diskSpace,
                   final double screenSize) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.diskSpace = diskSpace;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", discountRate=" + discountRate +
                ", stock=" + stock +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", ram=" + ram +
                ", diskSpace=" + diskSpace +
                ", screenSize=" + screenSize +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(final int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(final int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(final Brand brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(final int ram) {
        this.ram = ram;
    }

    public int getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(final int diskSpace) {
        this.diskSpace = diskSpace;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(final double screenSize) {
        this.screenSize = screenSize;
    }
}
