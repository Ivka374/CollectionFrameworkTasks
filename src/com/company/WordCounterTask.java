package com.company;

import java.util.*;

public class WordCounterTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().toLowerCase().split(" ");

        Map<String, Integer> wordCount = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        printWords(wordCount);
    }

    private static void printWords(Map<String, Integer> wordAmount){
        for (String word : wordAmount.keySet()) {
            System.out.println(word + " " + wordAmount.get(word));
        }
    }
}
