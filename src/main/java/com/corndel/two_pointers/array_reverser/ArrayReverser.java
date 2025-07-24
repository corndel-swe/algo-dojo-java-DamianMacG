package com.corndel.two_pointers.array_reverser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReverser {
    public static int[] reverseBruteForce(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            list.add(arr[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }


    public static int[] reverseTwoPointers(int[] arr) {
        int[] copiedArray = arr.clone();

        int left = 0;
        int right = copiedArray.length - 1;

        while (left < right) {
            int temp = copiedArray[left];
            copiedArray[left] = copiedArray[right];
            copiedArray[right] = temp;

            left++;
            right--;
        }


        return Arrays.copyOfRange(copiedArray, 0, left);

    }

}
