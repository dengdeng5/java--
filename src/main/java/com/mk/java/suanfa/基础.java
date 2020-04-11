package com.mk.java.suanfa;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class 基础 {

       /* public static void main(String[] args) {
            String s = "hello";
            String t = s;
            s = "world";
            System.out.println(t); // t是"hello"还是"world"?  是hello
        }*/


    /**
     * break会结束整个循环，continue会结束当前循环，执行下一个循环。
     * @param args
     */
    /*public static void main(String[] args) {
        String[] names = {"ABC", "XYZ", "zoo"};

        for (String name : names) {
            if (name.equals("XYZ")){
                continue;
            }
        }
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?  xyz   引用关系，不会改变
    }*/
    public static void main(String[] args) {

        ArrayList<user> objects = new ArrayList<>();
        objects.add(new user("1",null));
        objects.add(new user("2","2"));
        objects.add(null);
        objects.removeAll(Collections.singleton(null));


        System.out.println(objects.toArray());
    }


    public static void aa(){

        user user = new user("1", "3");

    }



    }


