package com.github.jengo.java.program.design10.ch24;

public class TestSelectionSort {

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -2, -4.5};
        SelectionSort.selectionSort(list);

        for (double aList : list) {
            System.out.print(aList + " ");
        }
    }

}
