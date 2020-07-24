package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class KidnapperTask {
    public static void main(String[] args) {
        List<String> availableWords = new LinkedList<>();
        List<String> neededWords = new LinkedList<>();
        boolean isPossible = false;

        Scanner scanner = new Scanner(System.in);
        String availableRow = scanner.nextLine();
        String neededRow = scanner.nextLine();
        String[] availableArray = availableRow.split(" ");
        String[] neededArray = neededRow.split(" ");
        availableWords = Arrays.asList(availableArray);
        neededWords = Arrays.asList(neededArray);

        for (String word : neededWords){
            if (availableWords.contains(word)){
                isPossible = true;
            } else {
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible ? "You get money" : "You are busted");
    }
}
