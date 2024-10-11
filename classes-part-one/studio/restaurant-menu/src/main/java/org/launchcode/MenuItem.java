package org.launchcode;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public void printMenuItem() {
        System.out.println("\nMENU ITEM:");
        System.out.println("\t" + this.getDescription() + " - " + this.getCategory() + " - price: $" + this.getPrice());
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        MenuItem itemToCompare = (MenuItem) toBeCompared;
        return itemToCompare.getDescription().equals(this.getDescription()) && itemToCompare.getCategory().equals(this.getCategory());
    }
}
