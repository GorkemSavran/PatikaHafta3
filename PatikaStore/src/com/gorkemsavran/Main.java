package com.gorkemsavran;

import com.gorkemsavran.sreen.factory.DefaultScreenFactory;
import com.gorkemsavran.sreen.factory.ScreenFactory;
import com.gorkemsavran.store.Store;

public class Main {

    private static Store store = new Store();

    public static void main(String[] args) {
        System.out.println("PatikaStore Ürün Yönetim Paneli!");
        ScreenFactory screenFactory = new DefaultScreenFactory();
        screenFactory.createMainScreen().onScreen();
    }

    public static Store getStore() {
        return store;
    }
}
