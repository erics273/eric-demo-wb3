package com.pluralsight;

import java.util.ArrayList;

public class ComplexArrayListExample {

    public static void main(String[] args) {

        //create an populate our ArrayList of Inentory
        ArrayList<Product> poopList = getInventory();

        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < poopList.size(); i++) {
            //so i don't need the poopList.get(i) a 100 times lets assign it to p
            Product p = poopList.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        // this method loads product objects into inventory
        // and its details are not shown

        inventory.add(new Product(1, "Magic Stuff", 10.00));
        inventory.add(new Product(2, "Dangerous Stuff", 20.00));
        inventory.add(new Product(3, "Gross Stuff", 100.00));

        return inventory;
    }

}
