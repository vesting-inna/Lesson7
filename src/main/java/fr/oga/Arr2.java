package fr.oga;

import java.util.Objects;
import java.util.Stack;

public class Arr2 {
    public static void arr2() {
        String ourString = "(){}[]}";
        Stack<String> trueBrace = new Stack<>();
        char value;

        if (ourString.isEmpty()) {
            System.out.println("This sequence is wrong - there is no Braces");
        } else {
            for (int i = 0; i < ourString.length(); i++) {
                value = ourString.charAt(i);
                String str = Character.toString(value);
                if ((str.equals("{")) || (str.equals("(")) || (str.equals("["))) {
                    trueBrace.push(str);
                } else {
                    if (((str.equals("}")) || (str.equals(")")) || (str.equals("]"))) && trueBrace.empty()) {
                        trueBrace.push(str);
                        break;
                    } else {
                        if ((str.equals("}")) && (Objects.equals(trueBrace.lastElement(), "{")) ||
                                (str.equals(")")) && (Objects.equals(trueBrace.lastElement(), "(")) ||
                                (str.equals("]")) && (Objects.equals(trueBrace.lastElement(), "["))) {
                            trueBrace.clear();
                        } else {
                            trueBrace.push(str);
                        }
                    }
                }
            }
            if (trueBrace.empty()) {
                System.out.println("This sequence " + ourString + " is correct. Let's check if the stack is empty? " + trueBrace.empty());
            } else {
                System.out.println("This sequence " + ourString + " is wrong. Let's check if the stack is empty? " + trueBrace.empty());
            }
        }
    }
}


