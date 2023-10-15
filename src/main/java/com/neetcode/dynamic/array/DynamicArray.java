package com.neetcode.dynamic.array;
public class DynamicArray {
    private int capacity;

    private int size;
    private int[] persistence;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.persistence = new int[capacity];
    }

    public int get(int i) {

        return i < this.size ? this.persistence[i] : -1;
    }

    public void set(int i, int n) {
        this.persistence[i] = n;
        if (i == this.size){
            this.size ++;
        }
    }

    public void pushback(int n) {
        if (this.size == this.capacity){
            this.resize();
        }
        this.set(this.size, n);
    }

    public int popback() {
        this.size --;
        return this.persistence[this.size];
    }

    private void resize() {
        int[] newPersistance = new int[this.capacity * 2];

        for(int i=0; i<this.size;i++){
            newPersistance[i] = this.persistence[i];
        }

        this.capacity = this.capacity * 2;
        this.persistence = newPersistance;
    }

    public int getSize() {

        return this.size;
    }

    public int getCapacity() {

        return this.capacity;
    }
}

