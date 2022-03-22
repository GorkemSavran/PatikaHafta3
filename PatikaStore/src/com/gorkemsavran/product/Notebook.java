package com.gorkemsavran.product;

import com.gorkemsavran.Brand;

public class Notebook extends Product {

    public Notebook(final int id,
                    final double price,
                    final int discountRate,
                    final int stock,
                    final String name,
                    final Brand brand,
                    final int ram,
                    final int diskSpace,
                    final double screenSize) {
        super(id, price, discountRate, stock, name, brand, ram, diskSpace, screenSize);
    }
}
