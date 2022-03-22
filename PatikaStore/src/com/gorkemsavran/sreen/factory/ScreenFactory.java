package com.gorkemsavran.sreen.factory;

import com.gorkemsavran.product.Product;
import com.gorkemsavran.sreen.AbstractScreen;
import com.gorkemsavran.sreen.ListBrandsScreen;
import com.gorkemsavran.sreen.MainScreen;

public interface ScreenFactory {
    AbstractScreen createMainScreen();
    AbstractScreen createProductScreen(Class<? extends Product> productClazz);
    AbstractScreen createListBrandsScreen();

    AbstractScreen createAddPhoneScreen();
    AbstractScreen createNotebookScreen();
}
