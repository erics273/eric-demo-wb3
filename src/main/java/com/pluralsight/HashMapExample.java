package com.pluralsight;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        //lets create the hashmap
        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();

        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");
       // statesAndCapitals.put("AK", "Ancorage");



        //print out a representation of the entire map
        System.out.println(statesAndCapitals);

        //print out just the values in the map
        System.out.println(statesAndCapitals.values());

        //print out just the keys
        System.out.println(statesAndCapitals.keySet());

        //print out a value by it's key
        System.out.println(statesAndCapitals.get("TX"));



        //try to lookup a key that doesnt exit
        String stateCapitalofAK = statesAndCapitals.get("AK");

        //did we find, great, print it, if not, we aint found SH*T
        if(stateCapitalofAK == null){
            System.out.println("not in the map");
        }else{
            System.out.println(stateCapitalofAK);
        }

        //looping over the values specifically
        for (String capital : statesAndCapitals.values()) {
            System.out.println(capital);
        }

        //loop over the keys and use the key inside the loop to get the value
        for (String stateAbbreviation : statesAndCapitals.keySet()) {
            System.out.println(stateAbbreviation + ": " + statesAndCapitals.get(stateAbbreviation));
        }

    }
}
