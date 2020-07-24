package com.company;

import java.util.*;

public class DetectiveTask {
    public static void main(String[] args) {
        Map<Character, Integer> firstWordLetters = new HashMap<>();
        int differentLetters = 0;

        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine().toLowerCase();
        String secondWord = scanner.nextLine().toLowerCase();

        for (int i = 0; i < firstWord.length(); i++){
            char currentLetter = firstWord.charAt(i);
            firstWordLetters.merge(currentLetter, 1, Integer::sum);
        }
        for (int i = 0; i < secondWord.length(); i++){
            char currentLetter = secondWord.charAt(i);
            if (firstWordLetters.get(currentLetter) != null){
                firstWordLetters.put(currentLetter, firstWordLetters.get(currentLetter) - 1);
                if (firstWordLetters.get(currentLetter) == 0)firstWordLetters.remove(currentLetter);
            } else {
                differentLetters++;
            }
        }

        if (!firstWordLetters.isEmpty()) {
            for (Character i : firstWordLetters.keySet()) {
                differentLetters += firstWordLetters.get(i);
            }
            firstWordLetters.clear();
        }

        System.out.println(differentLetters);
    }
}
