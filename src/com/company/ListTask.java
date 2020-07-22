package com.company;

import java.util.*;

public class ListTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");
        List<Integer> reversedList = new ArrayList<>();

        for (int i = 1; i < stringArray.length; i+=2) {
            reversedList.add(Integer.parseInt(stringArray[i]));
        }

        Collections.reverse(reversedList);
        for (int i = 0; i < reversedList.size(); i++){
            System.out.print(reversedList.get(i) + " ");
        }
    }
}
