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

        //print out the list
        System.out.println(kids);

        //loop over the list with a traditional for
        //we use .size() to know how many items are on the list
        for (int i = 0; i < kids.size(); i++) {
            //use get() to get it by index
            System.out.println(i + " " + kids.get(i) );
        }

        //use the for-each
        int i = 1;
        for (String kid : kids){
            System.out.println(i + ". " + kid);
            i++;
        }
    }

}
