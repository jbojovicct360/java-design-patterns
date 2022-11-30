
package com.trade.jimi.factories;

import com.trade.jimi.products.Gpu;
import com.trade.jimi.products.Monitor;
import com.trade.jimi.products.MsiGpu;
import com.trade.jimi.products.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

}