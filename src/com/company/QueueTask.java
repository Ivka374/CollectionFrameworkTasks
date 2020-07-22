package com.company;

import java.util.*;

public class QueueTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNumber = scanner.nextInt();

        Queue<Integer> core1 = new LinkedList<>();
        Queue<Integer> core2 = new LinkedList<>();

        int core1difficulty = 0;
        int core2difficulty = 0;

        for (int i = 0; i < taskNumber; i++){
            int indicator = scanner.nextInt();
            int difficulty = scanner.nextInt();

            if (core1difficulty > core2difficulty){
                core2difficulty += difficulty;
                core2.add(indicator);
            } else {
                core1difficulty += difficulty;
                core1.add(indicator);
            }
        }

        System.out.println("====================");
        for (Integer i :
                core1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i :
                core2) {
            System.out.print(i + " ");
        }
    }
}
