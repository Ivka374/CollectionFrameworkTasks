package com.company;

import java.util.*;

public class DetectiveTask {
    public static void main(String[] args) {
        Map<Character, Integer> firstWordLetters = new HashMap<>();
        Map<Character, Integer> secondWordLetters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        for (int i = 0; i < firstWord.length(); i++){
            char currentLetter = firstWord.charAt(i);
            firstWordLetters.merge(currentLetter, 1, Integer::sum);
        }
        for (int i = 0; i < secondWord.length(); i++){
            char currentLetter = secondWord.charAt(i);
            secondWordLetters.merge(currentLetter, 1, Integer::sum);
        }
    }
}
