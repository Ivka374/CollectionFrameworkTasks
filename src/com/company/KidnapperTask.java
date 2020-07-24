package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class KidnapperTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] availableWords = scan.nextLine().split(" ");
        String[] neededWords = scan.nextLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : availableWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        boolean isPossible = true;

        for (String word : neededWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) - 1);
                if (map.get(word) == 0) {
                    map.remove(word);
                }
            } else {
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible ? "You get money" : "You are busted");
    }
}
