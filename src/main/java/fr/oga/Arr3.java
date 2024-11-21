package fr.oga;

import java.util.HashMap;

public class Arr3 {
    public static void arr3() {
        String ourString = "hello world";
        HashMap<Character, Integer> map = new HashMap<>();
        int counter = 1;

        for (int i = 0; i < ourString.length(); i++) {
            if (map.containsKey(ourString.charAt(i))) {
                counter = counter + 1;
                map.put(ourString.charAt(i), counter);
            } else {
                counter = 1;
                map.put(ourString.charAt(i), counter);
            }
        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " - " + value);
        }
    }
}
