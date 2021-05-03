package com.restaurant;

import java.util.Objects;

public class MenuItem {
    private final int id;
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(int id, double price, String description, String category, boolean newItem) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public double getPrice() {
        return price;
    }

    public boolean isNew(){
        return newItem;
    }

    @Override
    public String toString() {
        return "MenuItem " +
                "price = " + price +
                ", description = '" + description + '\'' +
                ", category = '" + category + '\'' +
                ", newItem = " + (newItem ? "Yes" : "No") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 && isNewItem() == menuItem.isNewItem() && Objects.equals(getDescription(), menuItem.getDescription()) && Objects.equals(getCategory(), menuItem.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getDescription(), getCategory(), isNewItem());
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean aCategory) {
        newItem = aCategory;
    }
}
