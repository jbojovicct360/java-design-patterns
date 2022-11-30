

package com.trade.jimi.factories;

import com.trade.jimi.products.Gpu;
import com.trade.jimi.products.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
