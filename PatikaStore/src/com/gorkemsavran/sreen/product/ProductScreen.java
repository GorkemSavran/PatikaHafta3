package com.gorkemsavran.sreen.product;

import com.gorkemsavran.Brand;
import com.gorkemsavran.Brands;
import com.gorkemsavran.Main;
import com.gorkemsavran.product.Notebook;
import com.gorkemsavran.product.Phone;
import com.gorkemsavran.product.Product;
import com.gorkemsavran.sreen.AbstractScreen;
import com.gorkemsavran.sreen.option.OnlyMessageOption;
import com.gorkemsavran.sreen.option.StandardOption;

public class ProductScreen extends AbstractScreen {

    private Class<? extends Product> productClazz;

    public ProductScreen(final Class<? extends Product> productClazz) {
        this.productClazz = productClazz;
    }

    @Override
    protected void prepareOptions() {
        addOption(new OnlyMessageOption(productClazz.getSimpleName() + " ekranı"));
        addOption(new StandardOption(0, "Geri git!", () -> {
        }));
        addOption(new StandardOption(1, "Ürünleri Listele", () -> Main.getStore().listProducts(productClazz)));
        addOption(new StandardOption(2, "Ürün Ekle", this::addProduct));
        addOption(new StandardOption(3, "Ürün sil", this::deleteProduct));
        addOption(new StandardOption(4, "Ürünleri filtrele", this::filterProducts));
    }

    private void filterProducts() {
        System.out.print("Filtrelenmesini istediğiniz marka: ");
        String brandName = scanner.next();
        Main.getStore().listProducts(productClazz, brandName);
    }

    private void deleteProduct() {
        System.out.print("Silinmesini istediğiniz ürün id'si: ");
        int id = scanner.nextInt();
        Main.getStore().deleteProduct(productClazz, id);
    }

    private void addProduct() {
        if (productClazz.equals(Phone.class)) {
            screenFactory.createAddPhoneScreen().onScreen();
        } else if (productClazz.equals(Notebook.class)) {
            screenFactory.createNotebookScreen().onScreen();
        }
    }

}
