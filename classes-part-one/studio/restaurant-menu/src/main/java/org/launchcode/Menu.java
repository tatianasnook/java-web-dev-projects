package org.launchcode;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<MenuItem> menuItems = new ArrayList<>();


    public List<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void addMenuItem(MenuItem newItem) {
        if (!menuItems.contains(newItem)) {
            this.menuItems.add(newItem);
        }
    }

    public void removeMenuItem(MenuItem menuItem) {
        int indexMenuItem = this.menuItems.indexOf(menuItem);
        if (indexMenuItem != -1) {
            this.menuItems.remove(indexMenuItem);
        }
    }

    public void printMenu() {
        System.out.println("\nMENU:");

        for (MenuItem menuItem : menuItems) {
            System.out.println("\t" + menuItem.getDescription() + " - " + menuItem.getCategory() + " - price: $" + menuItem.getPrice());
        }
    }

}
