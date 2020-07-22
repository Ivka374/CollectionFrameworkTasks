package com.company;

import java.util.*;

public class MapAnagramTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine().toLowerCase(Locale.ENGLISH);
        String b = scanner.nextLine().toLowerCase(Locale.ENGLISH);

        boolean result = isAnagram(a, b);

        System.out.println(result ? "yes" : "no");
    }

    public static boolean isAnagram(String a, String b){
        Map<Character, Integer> letterAmountA = new HashMap<>();
        Map<Character, Integer> letterAmountB = new HashMap<>();

        for (char letter : a.toCharArray()){
            if (letterAmountA.containsKey(letter)){
                letterAmountA.put(letter, letterAmountA.get(letter) + 1);
            } else {
                letterAmountA.put(letter, 1);
            }
        }

        for (char letter : b.toCharArray()){
            if (letterAmountB.containsKey(letter)){
                letterAmountB.put(letter, letterAmountB.get(letter) + 1);
            } else {
                letterAmountB.put(letter, 1);
            }
        }

        if (letterAmountA.equals(letterAmountB))return true;
        return false;
    }
}
