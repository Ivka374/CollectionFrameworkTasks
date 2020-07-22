package com.company;

import java.util.Scanner;
import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Stack<Character> openingBrackets = new Stack<>();
        boolean balanced = false;
        char a;
        char b;

        for (int i = 0; i < input.length(); i++){
            a = input.charAt(i);
            if (a == '(' || a == '[' || a == '{'){
                openingBrackets.push(a);
            } else {
                if (a == ')' || a == ']' || a == '}'){
                    if (openingBrackets.size() == 0){
                        balanced = false;
                        break;
                    }
                    b = openingBrackets.pop();
                    if (a == ')' && b == '('|| a == ']' && b == '[' || a == '}' && b == '{'){
                        balanced = true;
                    } else {
                        balanced = false;
                        break;
                    }
                }
            }
        }

        if (openingBrackets.size() != 0){
            balanced = false;
        }
        System.out.println(balanced);
    }
}
