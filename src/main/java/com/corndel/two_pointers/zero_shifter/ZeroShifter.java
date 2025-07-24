package com.corndel.two_pointers.zero_shifter;

import java.util.ArrayList;
import java.util.List;

public class ZeroShifter {

    public static int[] shiftZerosBruteForce(int[] arr) {
        List<Integer> nonZeros = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        for (int num : arr) {
            if (num == 0) {
                zeros.add(num);
            } else {
                nonZeros.add(num);
            }
        }

        int[] result = new int[arr.length];
        int i = 0;

        for (int num : nonZeros) {
            result[i++] = num;
        }
        for (int num : zeros) {
            result[i++] = num;
        }

        return result;
    }


    public static int[] shiftZerosTwoPointers(int[] arr) {
        int[] copiedArray = arr.clone();
        int insertPos = 0;

        for (int num : arr) {
            if (num != 0) {
                copiedArray[insertPos++] = num;
            }
        }

        while (insertPos < copiedArray.length) {
            copiedArray[insertPos++] = 0;
        }

        return copiedArray;
    }
}
