package com.github.jengo.java.program.design10;

import com.github.jengo.java.program.design10.ch24.Heap;

public class TestHeap {
    public static void main(String[] args) {
        Heap<Integer> heap =
                new Heap<Integer>(new Integer[]{8, 9, 2, 3, 4, 1, 5, 6, 7});

        while (heap.getSize() > 0)
            System.out.print(heap.remove() + " ");
    }
}
