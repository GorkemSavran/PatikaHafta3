package com.gorkemsavran.store;

import com.gorkemsavran.Brand;
import com.gorkemsavran.product.Phone;
import com.gorkemsavran.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Store {

    private Scanner scanner = new Scanner(System.in);
    private List<Product> products = new ArrayList<>();

    public void listProducts(final Class<? extends Product> productClazz) {
        products
                .stream()
                .filter(product -> product.getClass().equals(productClazz))
                .forEach(System.out::println);
    }

    public void listProducts(final Class<? extends Product> productClazz, final String brandName) {
        products
                .stream()
                .filter(product -> product.getClass().equals(productClazz) &&
                        product.getBrand().getName().equals(brandName))
                .forEach(System.out::println);
    }

    public void addProduct(final Product product) {
        boolean isSuccessfullyAdded = products.add(product);
        if (isSuccessfullyAdded) {
            System.out.println("Ürün başarıyla eklendi!");
        } else {
            System.out.println("Ürün eklenirken bir hata oluştu!");
        }
    }

    public void deleteProduct(final Class<? extends Product> productClazz, final int id) {
        Optional<Product> optionalProduct = products
                .stream()
                .filter(product -> product.getClass().equals(productClazz) && product.getId() == id)
                .findFirst();
        if (optionalProduct.isPresent()) {
            boolean isRemovedSuccessfully = products.remove(optionalProduct.get());
            if (isRemovedSuccessfully) {
                System.out.println("Ürün başarıyla silindi!");
            } else {
                System.out.println("Ürün silinirken bir hata oluştu!");
            }
        } else {
            System.out.println("Ürün bulunamadı!");
        }
    }

}
