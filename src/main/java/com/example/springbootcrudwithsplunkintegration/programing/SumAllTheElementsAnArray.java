package com.example.springbootcrudwithsplunkintegration.programing;

import java.util.Arrays;

public class SumAllTheElementsAnArray {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 4};

        System.out.println("Sum of all elements in an array : " + sum(arr));
        System.out.println("Sum of all elements in an array : " + sumUsingjava8(arr));
        System.out.println("min elements : " + minElement(arr));
        System.out.println("max elements : " + maxElement(arr));
        System.out.println("sorting Array elements : " + Arrays.toString(sortingArrayASC(arr)));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for(int i=0; i < arr.length; i++) {
            sum +=  arr[i];
        }
        return sum;
    }

    public static int sumUsingjava8(int[] arr) {
       return Arrays.stream(arr).sum();
    }

    public static int minElement(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }
    public static int maxElement(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int[] sortingArrayASC(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }

}
