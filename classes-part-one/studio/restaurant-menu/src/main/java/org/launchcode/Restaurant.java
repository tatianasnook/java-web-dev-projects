package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {

        Menu restaurantMenu = new Menu();

        MenuItem salad = new MenuItem(7.99, "Fresh spring salad", "appetizer");
        MenuItem burger = new MenuItem(15.99, "Burger with French fries", "main course");
        MenuItem iceCream = new MenuItem(9.99, "Vanilla ice cream with chocolate syrup", "dessert");

        restaurantMenu.addMenuItem(salad);
        restaurantMenu.addMenuItem(burger);
        restaurantMenu.addMenuItem(iceCream);

        burger.printMenuItem();
        restaurantMenu.printMenu();


    }
}
