package com.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date today = new Date();
        MenuItem menuItem = new MenuItem(50.5, "Tacos", "Dessert",true);
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menuItem);

        Menu menu = new Menu(menuItems,today);
        System.out.println(menuItem.getPrice());
        System.out.println(menu.getMenuItems());
    }
}
