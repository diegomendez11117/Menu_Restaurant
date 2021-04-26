package com.restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(double price, String description, String category, boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public double getPrice() {
        return price;
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
