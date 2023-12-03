package cz.martinkostelecky;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "ABBA";
        System.out.println(duplicateCount(text));
    }
    public static int duplicateCount(String text) {
        // create a HashMap
        HashMap <Character, Integer> duplicatesCountMap = new HashMap<>();

        // Converts this string to lowercase and a new character array
        char[] textToCharArray = text.toLowerCase().toCharArray();

        for (char ch : textToCharArray) {
            if (duplicatesCountMap.containsKey(ch)) {
                // get value by key and increment it's value by one
                duplicatesCountMap.put(ch, duplicatesCountMap.get(ch) + 1);
            } else {
                duplicatesCountMap.put(ch, 1);
            }
        }
        //take all elements of hashmap as a set and remove element that appears less then 2
        duplicatesCountMap.entrySet().removeIf(value -> value.getValue() < 2);
        //return number of elements in hashmap
    return duplicatesCountMap.size();
    }
}

