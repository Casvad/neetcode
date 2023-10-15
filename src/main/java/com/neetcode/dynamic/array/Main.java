package com.neetcode.dynamic.array;

public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.pushback(2);
        dynamicArray.pushback(4);
        dynamicArray.set(0,0);

        System.out.println(dynamicArray);
    }
}