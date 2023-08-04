package com.DataStructures.LL;

public class CircularLinkedlist {
    Node head = null;
    Node tail = null;

    int size = 0;
    public class Node {
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

    public void insertCC(int val){
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteCC(int val){
        Node temp = head;
        if (temp == null){
            return;
        }
        if (temp.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = temp.next;
            if (n.val == val) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while (temp != head);

    }
    public void showCircularLinkedList(){
        Node temp = head;
        if (head != null){
            do{
                System.out.print(temp.val + "->");
                temp = temp.next;
            }while (temp !=head);
            System.out.println("Head");
            System.out.println("Size of LL : "+size);
        }

    }

}
