package com.gorkemsavran.sreen.factory;

import com.gorkemsavran.product.Product;
import com.gorkemsavran.sreen.*;
import com.gorkemsavran.sreen.product.ProductScreen;
import com.gorkemsavran.sreen.product.add.AddNotebookScreen;
import com.gorkemsavran.sreen.product.add.AddPhoneScreen;

public class DefaultScreenFactory implements ScreenFactory {

    @Override
    public MainScreen createMainScreen() {
        return new MainScreen();
    }

    @Override
    public AbstractScreen createProductScreen(final Class<? extends Product> productClazz) {
        return new ProductScreen(productClazz);
    }

    @Override
    public AbstractScreen createListBrandsScreen() {
        return new ListBrandsScreen();
    }

    @Override
    public AbstractScreen createAddPhoneScreen() {
        return new AddPhoneScreen();
    }

    @Override
    public AbstractScreen createNotebookScreen() {
        return new AddNotebookScreen();
    }
}
