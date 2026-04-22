package com.pluralsight;

import java.util.ArrayList;

public class ArrayListsExamples {
    public static void main(String[] args) {

        //create the empty list
        ArrayList<String> kids = new ArrayList<String>();

        //add 3 rugrats to the list
        kids.add("Natalie");
        kids.add("Brittany");
        kids.add("Zachary");

        kids.set(1, "Brit");

        //print out the list
        System.out.println(kids);

        //loop over the list with a traditional for
        //we use .size() to know how many items are on the list
        for (int i = 0; i < kids.size(); i++) {
            //use get() to get it by index
            System.out.println(i + " " + kids.get(i) );




            //manipulate the list to make the names all uppercase
            kids.set(i, kids.get(i).toUpperCase());

        }

        //remove the middle child before we loop over the list again
        kids.remove(1);

        //use the for-each to loop over he list again
        int i = 1;
        for (String kid : kids){
            System.out.println(i + ". " + kid);
            i++;
        }
    }

}
