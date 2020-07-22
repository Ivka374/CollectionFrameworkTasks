package com.company;

import java.util.*;

public class SetTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dictionarySize = scanner.nextInt();
        Set<String> dictionary = new HashSet<>();

        String temp;
        for (int i = 0; i <= dictionarySize; i++){
            temp = scanner.nextLine().toLowerCase();
            dictionary.add(temp);
        }

        int textLineNumber = scanner.nextInt();
        Set<String> words = new HashSet<>();

        for (int i = 0; i <= textLineNumber; i++){
            temp = scanner.nextLine().toLowerCase();
            String[] text = temp.split(" ");
            words.addAll(Arrays.asList(text));
        }

        Set<String> newWords = new HashSet<>(words);
        newWords.removeAll(dictionary);

        System.out.println("=====================");
        for (String word : newWords) {
            System.out.println(word);
        }


        //  new solution from here

        /*
        Map<String, Integer> dictionaryMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> newWordsMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        int lines = scanner.nextInt();
        for (int i = 0; i < lines; i++){
            dictionaryMap.put(scanner.nextLine(), null);
        }

        lines = scanner.nextInt();
        for (int i = 0; i < lines; i++){
            String[] words2 = scanner.nextLine().split(" ");
            for (String str : words2){
                if (!dictionaryMap.containsKey(str)){
                    newWordsMap.put(str, null);
                }
            }
        }

        for (String w :
                newWordsMap.keySet()) {
            System.out.println(w);
        }*/
    }
}
