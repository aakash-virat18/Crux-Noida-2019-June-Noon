package com.codingblocks.lec15;

public class TA implements Teacher,Student{
    @Override
    public void teach() {
        System.out.println("I teach more like a teacher");
    }

    @Override
    public void study() {
        System.out.println("I study more like a student");
    }
}
