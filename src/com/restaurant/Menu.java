package com.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdate;

    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdate) {
        this.menuItems = menuItems;
        this.lastUpdate = lastUpdate;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem aMenuItem){
        if(menuItems.stream().noneMatch(item -> item.equals(aMenuItem)))
            menuItems.add(aMenuItem);
        else
            System.out.print("Sorry you can not add the same item");
    }

    public void removeMenuItem(MenuItem aMenuItem){
        menuItems.remove(aMenuItem);
    }

    public Date getLastUpdate() {
        return (Date)lastUpdate.clone();
    }

    public void printMenu(){
        System.out.println("The menu is: ");
        menuItems.forEach(item -> System.out.println(item.toString()));
        System.out.println("The last Update of this menu is:" + lastUpdate.toString());
    }

    public void setLastUpdate(Date aLastUpdate) {
        lastUpdate = aLastUpdate;
    }


}
