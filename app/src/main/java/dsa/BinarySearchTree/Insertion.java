package dsa.BinarySearchTree;

public class Insertion {
    

    public class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // Insertion(){
    //     head=null;
    // }
    Node insertNode(Node head,int data){
        if(head==null)
            return new Node(data);
        else if(data<head.data)
            head.left=insertNode( head.left,data);
        else
            head.right=insertNode(head.right, data);
        return head;   
    }

    void inOrder(Node head){
        if(head==null)
            return;
        inOrder(head.left);
        System.out.print(head.data+" ");
        inOrder(head.right);
    }

    int searchNodeNumber(Node root,int path,int val){
        if(root==null)
            return -1;
        else if(val<root.data)
           path= searchNodeNumber(root.left, ++path, val);
        else if(val>root.data)
            path=searchNodeNumber(root.right, ++path, val);
        return path;
    }
    
    public static void main(String[] args) {
        int arr[]={3,2,7,1,5,8,4,6};
        Insertion obj= new Insertion();
        Node head=null;
        for(int i:arr){
            head=obj.insertNode(head, i);
        }
        obj.inOrder(head);
        System.out.println("Path = "+obj.searchNodeNumber(head, 1, 4));
    }
}
