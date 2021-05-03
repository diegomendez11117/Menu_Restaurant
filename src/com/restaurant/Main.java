package com.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date today = new Date();
        MenuItem tacos = new MenuItem(1, 50.5, "Tacos", "Lunch",true);
        MenuItem pizza = new MenuItem(2, 25.2, "Pizza", "Lunch",false);
        MenuItem pie = new MenuItem(3, 15, "Pie", "Dessert",false);

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(tacos);
        menuItems.add(pizza);
        menuItems.add(pie);

        Menu menu = new Menu(menuItems,today);
        menu.addMenuItem(pie);

        menu.printMenu();
        MenuItem findTacos = menu.getMenuItems().get(menu.getMenuItems().indexOf(tacos));
        System.out.print(findTacos);

        menu.removeMenuItem(tacos);
        menu.printMenu();
    }
}
