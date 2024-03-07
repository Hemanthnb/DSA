package dsa.LinkedList;

public class DoublyLinkedList {
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
    Node front;
    Node rear;

    DoublyLinkedList(){
        front=null;
        rear=null;
    }

    void addRear(int data){
        Node tempNode=new Node(data);
        if(front==null&&rear==null){
            front=tempNode;
            rear=front;
        }
        else{
            rear.next=tempNode;
            tempNode.prev=rear;
            rear=tempNode;
        }
    }
    void addFront(int data){
        Node tempNode=new Node(data);
        if(front==null&&rear==null){
            front=tempNode;
            rear=front;
        }
        else{
            tempNode.next=front;
            front.prev=
            rear=tempNode;
        }
    }



    
}
