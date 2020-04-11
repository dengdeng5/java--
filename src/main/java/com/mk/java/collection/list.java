package com.mk.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class list {

    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<Integer>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        Object[] integers = objects.toArray(new Object[2]);
        HashSet<Object> objects1 = new HashSet<>();

        for (Object integer : integers) {
            System.out.println(integers.getClass().getName());
        }
        if (objects != null){
            System.out.println("1111");
        }
    }
}
