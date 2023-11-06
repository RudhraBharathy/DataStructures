package com.DataStructures.LinkedList;

public class DoublyLinkedlist {
    Node head;
    Node tail;
    int size = 0;
    public class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if (tail == null){
            tail = head;
        }
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertMiddle(int val,int index) {
        if (index==0) {
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next,temp);
        temp.next = node;
        if (node.next != null) {
            temp.next.prev = node;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.prev = tail;
        node.next = null;
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void showDoublyLinkedList(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("Size of DLL : "+size);
    }

    public void reverseDoublyLinkedList(){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.prev;
        }
        System.out.println("Start");
    }

}
