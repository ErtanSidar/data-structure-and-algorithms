package com.essoft.algorithms.sortingAlgorithms;

public class A2SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {12, 24, 33, 11, 47, 9};
        selectionSort(numbers);
        for (Integer item : numbers) {
            System.out.println(item);
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }
}
