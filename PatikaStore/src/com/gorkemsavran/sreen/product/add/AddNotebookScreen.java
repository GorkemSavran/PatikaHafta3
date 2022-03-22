package com.gorkemsavran.sreen.product.add;

import com.gorkemsavran.Brands;
import com.gorkemsavran.Main;
import com.gorkemsavran.product.Notebook;
import com.gorkemsavran.sreen.AbstractScreen;
import com.gorkemsavran.sreen.option.StandardOption;

public class AddNotebookScreen extends AbstractScreen {
    @Override
    protected void prepareOptions() {
        System.out.println("Ürün id: ");
        int id = scanner.nextInt();
        System.out.println("Ürün fiyatı: ");
        double price = scanner.nextDouble();
        System.out.println("Ürün indirim oranı: ");
        int discountRate = scanner.nextInt();
        System.out.println("Ürün stok miktarı: ");
        int stock = scanner.nextInt();
        System.out.println("Ürün ismi: ");
        String name = scanner.next();
        System.out.println("Ürün markası: ");
        String brandName = scanner.next();
        System.out.println("Ürün ram'i: ");
        int ram = scanner.nextInt();
        System.out.println("Ürün disk alanı: ");
        int diskSpace = scanner.nextInt();
        System.out.println("Ürün ekran genişliği: ");
        double screenSize = scanner.nextDouble();

        Main.getStore().addProduct(new Notebook(id,
                price,
                discountRate,
                stock,
                name,
                Brands.valueOf(brandName).getBrand(),
                ram,
                diskSpace,
                screenSize));
    }
}
