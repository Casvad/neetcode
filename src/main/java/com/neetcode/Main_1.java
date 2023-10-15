package com.neetcode;

import com.neetcode.dynamic.array.DynamicArray;

public class Main_1 {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.pushback(2);
        dynamicArray.pushback(4);
        dynamicArray.set(0,0);

        System.out.println(dynamicArray);
    }
}