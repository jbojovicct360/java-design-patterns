
package com.trade.jimi.factories;

import com.trade.jimi.products.Burger;
import com.trade.jimi.products.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Veggie Burger...");
        return new VeggieBurger();
    }

}

