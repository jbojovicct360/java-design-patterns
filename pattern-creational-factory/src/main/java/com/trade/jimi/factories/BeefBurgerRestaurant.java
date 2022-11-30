
package com.trade.jimi.factories;

import com.trade.jimi.products.BeefBurger;
import com.trade.jimi.products.Burger;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef Burger...");
        return new BeefBurger();
    }

}

