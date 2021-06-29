package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Integer[] numbers = new Integer[101];
//        LinkedList<Integer> linkedNums = new LinkedList<>();
//        for (int i = 1; i < numbers.length; i++) {
//            numbers[i] = i;
//            if (i % 2 == 0) {
//                linkedNums.add(i);
//                if (i % 5 == 0) {
//                    linkedNums.addFirst(i);
//                }
//            }
//        }
//        Set<Integer> setNums = new LinkedHashSet<>(linkedNums);
//
//        System.out.println(setNums);

        getEvenNums();
    }

    public static void getEvenNums() {
        Integer[] nums = new Integer[101];
        Set<Integer> intSet = new LinkedHashSet<>();
        for (int i = 1; i < nums.length; i++) {
            if (i % 5 == 0 && i % 2 ==0){
                intSet.add(i);
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0){
                intSet.add(i);
            }
        }
        System.out.println(intSet);
    }
}
