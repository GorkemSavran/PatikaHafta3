package com.gorkemsavran.sreen;

import com.gorkemsavran.Brands;
import com.gorkemsavran.sreen.option.OnlyMessageOption;
import com.gorkemsavran.sreen.option.StandardOption;

public class ListBrandsScreen extends AbstractScreen {

    @Override
    protected void prepareOptions() {
        for (final Brands value : Brands.values()) {
            System.out.println("-" + value.getBrand().getName());
        }
    }
}
