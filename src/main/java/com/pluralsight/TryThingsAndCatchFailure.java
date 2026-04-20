package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryThingsAndCatchFailure {

    public static void main(String[] args) {



        try {
            // try to execute this code
            String[] someArray = {"Hi", "How", "are", "you"};
            System.out.println(someArray[4]);

        } catch (Exception error) {
            // unhandled exceptions route here
            // and are "handled" and then suppresseds
            //do something different on an error
            System.out.println("something went wrong");

            //you can also work with the exceptiom that was thrown
            //maybe
           //throw error;

        }

        boolean appRunning = true;

        while (appRunning) {

            Scanner scanner = new Scanner(System.in);
            try {

                //array of names
                String[] names = {
                        "Ezra", "Elisha", "Ian",
                        "Siddalee", "Pursalane", "Zephaniah"
                };

                //aske the user to pick a name by its number
                System.out.print("Pick a kid (select #1 - #6: 99 to exit): ");
                //wait for the anser
                int index = scanner.nextInt();

                if(index == 99){
                    appRunning = false;
                }

                index--; // change number from range 1-6 to range 0-5
                // as long as the user entered a number in the range
                // of 1 to 6, this will work. Otherwise the index
                // will be out of range.

                System.out.println(names[index]);
            }catch(InputMismatchException e){
                System.out.println("You didnt give a number, so try again");

            } catch (Exception e) {
                //tell the user what they did wrong
                System.out.println("Your number was out of range! try again");
                //print out the actual error, because we can
                 e.printStackTrace();
            }

        }

            //close the scanner
           // scanner.close();




    }

}
