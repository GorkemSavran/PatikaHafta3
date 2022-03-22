package com.gorkemsavran.product;

import com.gorkemsavran.Brand;

public class Phone extends Product {

    private int batteryPower;
    private String color;

    public Phone(final int id,
                 final double price,
                 final int discountRate,
                 final int stock,
                 final String name,
                 final Brand brand,
                 final int ram,
                 final int diskSpace,
                 final double screenSize,
                 final int batteryPower,
                 final String color) {
        super(id, price, discountRate, stock, name, brand, ram, diskSpace, screenSize);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(final int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }
}
