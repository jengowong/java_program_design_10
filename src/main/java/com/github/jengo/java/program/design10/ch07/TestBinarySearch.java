package com.github.jengo.java.program.design10.ch07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBinarySearch {
    private static final Logger LOG = LoggerFactory.getLogger(TestBinarySearch.class);

    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        int i = BinarySearch.binarySearch(list, 2); // Returns 0
        LOG.info("{}", i);
        int j = BinarySearch.binarySearch(list, 11); // Returns 4
        LOG.info("{}", j);
        int k = BinarySearch.binarySearch(list, 12); // Returns -6
        LOG.info("{}", k);
        int l = BinarySearch.binarySearch(list, 1); // Returns -1
        LOG.info("{}", l);
        int m = BinarySearch.binarySearch(list, 3); // Returns -2
        LOG.info("{}", m);
    }

}
