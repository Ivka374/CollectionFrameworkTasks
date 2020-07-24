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



    /*private static int getAnswer(String f, String s) {

        Map<Integer, Integer> fMap = new HashMap<>();
        Map<Integer, Integer> sMap = new HashMap<>();

        f.toLowerCase().chars().forEach(e -> {
            fMap.put(e, fMap.getOrDefault(e, 0) + 1);
        });

        s.toLowerCase().chars().forEach(e -> {
            sMap.put(e, sMap.getOrDefault(e, 0) + 1);
        });

        fMap.entrySet().forEach(e -> {
            if (sMap.containsKey(e.getKey())) {
                fMap.put(e.getKey(), Math.abs(fMap.get(e.getKey()) - sMap.remove(e.getKey())));
            }
        });

        return fMap.values().stream().reduce(
                sMap.values().stream().reduce(0, Integer::sum),
                Integer::sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();

        System.out.println(getAnswer(first, second));

    }*/
}
