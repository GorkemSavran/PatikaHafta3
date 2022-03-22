package com.gorkemsavran;

public enum Brands {
    Samsung(new Brand(0, "Samsung")),
    Lenovo(new Brand(1, "Lenovo")),
    Apple(new Brand(2, "Apple")),
    Huawei(new Brand(3, "Huawei")),
    Casper(new Brand(4, "Casper")),
    Asus(new Brand(5, "Asus")),
    HP(new Brand(6, "HP")),
    Xiaomi(new Brand(7, "Xiaomi")),
    Monster(new Brand(8, "Monster"));

    private final Brand brand;

    Brands(final Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }
}
