
package com.trade.jimi;

import com.trade.jimi.factories.AsusManufacturer;
import com.trade.jimi.factories.Company;
import com.trade.jimi.factories.MsiManufacturer;
import com.trade.jimi.products.Product;

import java.util.List;

public class MainApp {


    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);

    }

}
