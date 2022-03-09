package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(8);
        set1.add(9);
        set1.add(6);
        System.out.println("Set first: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(9);
        set2.add(8);
        set2.add(0);
        System.out.println("Set second: " + set2);

        symmetricDifference(set1,set2);
    }
        public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) {
            Set<Integer> symmetricDiff = new HashSet<Integer>(set1);
            symmetricDiff.addAll(set2);
            Set<Integer> tmp = new HashSet<>(set1);
            tmp.retainAll(set2);
            symmetricDiff.removeAll(tmp);
            System.out.println("Symmetric difference of two sets: "+symmetricDiff);
              return symmetricDiff;
        }
    }

