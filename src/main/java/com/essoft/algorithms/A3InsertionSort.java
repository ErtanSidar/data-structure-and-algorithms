package com.essoft.algorithms;

public class A3InsertionSort {

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 12, 6, 9};
        insertionSort(arr);
        for (Integer item : arr) {
            System.out.println(item);
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public static void insertionSortFor(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            for (int i = j - 1; i >= 0 && arr[i] > key; i--) {
                arr[i + 1] = key;
            }
        }
    }
}
