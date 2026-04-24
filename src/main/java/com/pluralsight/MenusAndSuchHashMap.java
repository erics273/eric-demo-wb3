package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenusAndSuchHashMap {

    public static Scanner userInputThing = new Scanner(System.in);

    public static void main(String[] args) {

        //determines if this should stop running
        boolean appRunning = true;

        while(appRunning) {
            //display the main menu
            System.out.print("""
                    What do you want to do?
                        1. View inventory
                        2. Manage customers
                        3. Look Up By ID
                        4. Exit this nonsense
                    Make you selection:
                    """);

            //store the users choice
            int mainMenuChoice = userInputThing.nextInt();

            switch (mainMenuChoice) {
                case 1:
                    viewInventory();
                    break;
                case 2:
                    manageCustomers();
                    break;
                case 3:
                    findProductByID();
                    break;
                case 4:
                    System.out.println("goodbye!");
                    appRunning = false;
                    break;
                default:
                    System.out.println("invalid selection try again");
            }
        }

    }

    //handle the work related to viewing inventory
    public static void viewInventory(){
        HashMap<Integer, Product> productsList = getInventory();

        //loop over the values of themap to display the products
        for (Product product : productsList.values()) {
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    product.getId(), product.getName(), product.getPrice());
        }
    }

    //hand the work related to managing customers
    public static void manageCustomers(){
        boolean appRunning = true;

        while (appRunning){
            System.out.println("""
                    Welcome to the manage customers menu, what can we do for you?
                        1. View customers
                        2. Add Customer
                        3. Go back to the main menu
                    """);

            int menuChoice = userInputThing.nextInt();

            switch (menuChoice){
                case 1:
                    System.out.println("Here are the customers");
                    break;
                case 2:
                    System.out.println("customer added");
                    break;
                case 3:
                    System.out.println("exiting to main menu");
                    appRunning = false;
                    break;
                default:
                    System.out.println("invalid selection");

            }
        }

    }

    public static HashMap<Integer, Product> getInventory() {
        HashMap<Integer, Product> inventory = new HashMap<>();
        // this method loads product objects into inventory
        // and its details are not shown

        //create the products
        Product product1 = new Product(10542, "Magic Stuff", 10.00);
        Product product2 = new Product(10986, "Dangerous Stuff", 20.00);
        Product product3 = new Product(272727, "Gross Stuff", 100.00);

        //put them in the map
        inventory.put(product1.getId(), product1);
        inventory.put(product2.getId(), product2);
        inventory.put(product3.getId(), product3);

        //return the products
        return inventory;
    }

    public static void findProductByID(){

        //load the inventory
        HashMap<Integer, Product> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");

        //get the productid from the user from the user
        int id = scanner.nextInt();

        //try to get the product out of the map by its id
        Product matchedProduct = inventory.get(id);

        //if we didnt find it, so be it tell the user
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        //print it if found
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());

    }

}
