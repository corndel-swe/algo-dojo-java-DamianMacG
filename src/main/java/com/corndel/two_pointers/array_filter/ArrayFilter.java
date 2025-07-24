package com.corndel.two_pointers.array_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayFilter {

    public static int[] getDistinctNumbersBruteForce(int[] arr) {
        List<Integer> list = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            return new int[0];
        }


        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    list.add(arr[i]);
                }

        }
        list.add(arr[arr.length - 1]);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] getDistinctNumbersTwoPointers(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] copiedArray = arr.clone();

        int write = 1;

        for (int i = 1; i < copiedArray.length; i++) {

            if (copiedArray[i] != copiedArray[i - 1]) {
                copiedArray[write] = copiedArray[i];
                write++;
            }
        }

        return Arrays.copyOfRange(copiedArray, 0, write);

    }
}
