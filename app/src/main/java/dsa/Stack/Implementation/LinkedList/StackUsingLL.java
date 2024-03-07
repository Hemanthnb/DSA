package dsa.Stack.Implementation.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class StackUsingLL {
    Node top;
    StackUsingLL(){
        top=null;
    }
    void push(int data){
        Node newNode= new Node(data);
        if(newNode==null){
            System.out.println("Stack overflow");
            return;
        }
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is UnderFlow");
        }
        else{
            top=top.next;
        }
    }
    void peek(){
        if(top==null){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(top.data);
        }
    }

    public static void main(String[] args) {
        
        StackUsingLL ll=new StackUsingLL();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.pop();
        ll.pop();
        ll.pop();
        ll.peek();
    }
    
}
