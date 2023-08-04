package com.DataStructures.LL;

public class SinglyLinkedlist {

    Node head;
    Node tail;

    int size = 0;
    public class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size++;
    }

    public void insertMiddle (int val,int index){
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
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteFirst(){
        head = head.next;
        if (head==null){
            tail = null;
        }
        size--;
    }

    public void deleteMiddle(int index){
        if (index == 0){
            deleteFirst();
            return;
        }
        if (index == size - 1){
            deleteLast();
            return;
        }
        Node prev = getPrevNodeIndex(index - 1);
        prev.next = prev.next.next;
        size--;
    }

    public void deleteLast(){
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node secondLastIndex = getPrevNodeIndex (size-2);
        tail = secondLastIndex;
        tail.next = null;
        size--;
    }


    public Node getPrevNodeIndex (int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void showSinglyLinkedList(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("Null");
        System.out.println("Size of LL : "+size);
    }

    public Node reverseSinglyLinkedList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current  = next;
        }
        return prev;
    }

    public Node showListFromMiddle(){

        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
