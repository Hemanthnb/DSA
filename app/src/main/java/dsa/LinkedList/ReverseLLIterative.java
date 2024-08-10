package dsa.LinkedList;

import org.checkerframework.checker.units.qual.h;

public class ReverseLLIterative {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    ReverseLLIterative() {
        head = null;
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    void traversal(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = reverse(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return curr;
    }

    public static void main(String[] args) {
        ReverseLLIterative obj = new ReverseLLIterative();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.traversal(obj.head);
        Node ptr = obj.reverse(obj.head);
        System.out.println();
        obj.traversal(ptr);
    }
}
