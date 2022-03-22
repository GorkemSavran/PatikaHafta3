package com.gorkemsavran.sreen;

import com.gorkemsavran.product.Notebook;
import com.gorkemsavran.product.Phone;
import com.gorkemsavran.sreen.option.StandardOption;

public class MainScreen extends AbstractScreen {

    @Override
    protected void prepareOptions() {
        addOption(new StandardOption(0, "Çıkış yap!", () -> System.exit(0)));
        addOption(new StandardOption(1, "Notebook İşlemleri", () -> screenFactory.createProductScreen(Notebook.class).onScreen()));
        addOption(new StandardOption(2, "Cep Telefonu İşlemleri", () -> screenFactory.createProductScreen(Phone.class).onScreen()));
        addOption(new StandardOption(3, "Marka Listele", () -> screenFactory.createListBrandsScreen().onScreen()));
    }
}
