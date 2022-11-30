

package com.trade.jimi;

import com.trade.jimi.factories.BeefBurgerRestaurant;
import com.trade.jimi.factories.Restaurant;
import com.trade.jimi.factories.VeggieBurgerRestaurant;

public class MainApp {


    public static void main(String[] args) {

        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();

    }

}
