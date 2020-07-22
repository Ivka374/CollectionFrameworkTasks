package com.company;

import java.util.*;

public class SetClass {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        String temp;
        SortedSet<String> input = new TreeSet<>();
        for (int i = 0; i <= n; i++){
            temp = scanner.nextLine();
            input.add(temp);
        }

        for (String s : input) {
            System.out.println(s);
        }
    }
}
