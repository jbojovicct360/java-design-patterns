
package com.trade.jimi.factories;

import com.trade.jimi.products.AsusGpu;
import com.trade.jimi.products.AsusMonitor;
import com.trade.jimi.products.Gpu;
import com.trade.jimi.products.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }



}
