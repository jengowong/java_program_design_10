package com.github.jengo.java.program.design10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SetListPerformanceTest {
    private static final Logger LOG = LoggerFactory.getLogger(SetListPerformanceTest.class);

    public static void main(String[] args) {
        // Create a hash set, and test its performance
        Collection<Integer> set1 = new HashSet<Integer>();
        LOG.info("Time for hash set is {} milliseconds", getTestTime(set1, 500000));

        // Create a linked hash set, and test its performance
        Collection<Integer> set2 = new LinkedHashSet<Integer>();
        LOG.info("Time for linked hash set is {} milliseconds", getTestTime(set2, 500000));

        // Create a tree set, and test its performance
        Collection<Integer> set3 = new TreeSet<Integer>();
        LOG.info("Time for tree set is {} milliseconds", getTestTime(set3, 500000));

        // Create an array list, and test its performance
        Collection<Integer> list1 = new ArrayList<Integer>();
        LOG.info("Time for array list is {} milliseconds", getTestTime(list1, 60000));

        // Create a linked list, and test its performance
        Collection<Integer> list2 = new LinkedList<Integer>();
        LOG.info("Time for linked list is {} milliseconds", getTestTime(list2, 60000));
    }

    public static long getTestTime(Collection<Integer> c, int size) {
        long startTime = System.currentTimeMillis();

        // Add numbers 0, 1, 2, ..., size - 1 to the array list
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        Collections.shuffle(list); // Shuffle the array list

        // Add the elements to the container
        for (int element : list) {
            c.add(element);
        }

        Collections.shuffle(list); // Shuffle the array list

        // Remove the element from the container
        for (int element : list) {
            c.remove(element);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime; // Return the execution time
    }

}

