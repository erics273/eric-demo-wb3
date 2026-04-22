package com.pluralsight;

import java.util.Scanner;

public class MenusAndSuch {

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
                        3. Exit this nonsense
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
        System.out.println("here is the inventory");
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

}
