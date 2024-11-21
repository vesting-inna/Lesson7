package fr.oga;

import java.util.LinkedList;

public class Arr4 {
    public static void arr4() {
        LinkedList<Integer> evenNumbers = new LinkedList<>();
        evenNumbers.add(1);
        evenNumbers.add(2);
        evenNumbers.add(3);
        evenNumbers.add(4);
        evenNumbers.add(14);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(9);

        System.out.println("Initial list is " + evenNumbers);
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (evenNumbers.get(i) % 2 == 0) {
                evenNumbers.remove(i);
                i--;
            }
        }
        System.out.println("The list after even numbers deletion is " + evenNumbers);
    }
}


