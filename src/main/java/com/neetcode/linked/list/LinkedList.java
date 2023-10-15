package com.neetcode.linked.list;

import java.util.ArrayList;

public class LinkedList {

    private class Node {
        private Integer value;
        private Node next;
        public Node(Integer value, Node next){
            this.value = value;
            this.next = next;
        }
        public Node getNext(){
            return this.next;
        }

        public void setNext(Node next){
            this.next = next;
        }
        public Integer getValue() {
            return this.value;
        }
    }

    private Node head;

    public LinkedList() {
    }

    public int get(int index) {

        Node tmp = this.head;
        int i = 0;
        while(tmp != null && i < index){
            tmp = tmp.getNext();
            i ++;
        }

        return tmp == null ? -1 : tmp.getValue();
    }

    public void insertHead(int val) {

        this.head = new Node(val, this.head);
    }

    public void insertTail(int val) {

        if (this.head == null){
            this.head = new Node(val, null);
        } else {
            Node tmp = this.head;
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }

            tmp.setNext(new Node(val, null));
        }
    }

    public boolean remove(int index) {

        boolean removed = false;
        int i = 0;
        Node tmp = this.head;
        while(i < index - 1 && tmp != null){
            i++;
            tmp = tmp.getNext();
        }

        if (index == 0 && this.head != null){
            removed = true;
            this.head = this.head.getNext();
        } else if (tmp != null && tmp.getNext() != null){
            removed = true;
            tmp.setNext(tmp.getNext().getNext());
        }
        return removed;

    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> res = new ArrayList<>();
        Node tmp = this.head;
        while (tmp != null){
            res.add(tmp.getValue());
            tmp = tmp.getNext();
        }

        return res;
    }
}