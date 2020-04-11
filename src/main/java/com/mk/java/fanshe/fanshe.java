package com.mk.java.fanshe;

import java.lang.reflect.Method;
import java.net.URL;

public class fanshe {

    private String aa;
    private String bb;
    private String cc;
    private String dd;

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public static void main(String[] args) throws ClassNotFoundException {

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = systemClassLoader.loadClass("com.mk.java.fanshe.fanshe");
        String name = aClass.getName();
        Class<? extends Class> aClass1 = aClass.getClass();
        System.out.println(aClass1);
        Class<?> aClass2 = Class.forName("com.mk.java.fanshe.fanshe");
        Method[] methods = aClass2.getMethods();
        URL resource = systemClassLoader.getResource("");
    }



}
