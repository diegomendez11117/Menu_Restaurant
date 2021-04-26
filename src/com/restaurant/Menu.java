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
        menuItems.add(aMenuItem);
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date aLastUpdate) {
        lastUpdate = aLastUpdate;
    }


}
