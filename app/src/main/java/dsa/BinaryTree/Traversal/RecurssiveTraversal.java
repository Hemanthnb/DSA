package dsa.BinaryTree.Traversal;
import dsa.BinaryTree.NodeClass.Node;

public class RecurssiveTraversal {

    static void preOrder(Node head){
        if(head==null)
            return;
        System.out.print(head.data+" ");
        preOrder(head.left);
        preOrder(head.right);
    }

    static void inOrder(Node head){
        if(head==null)
            return;
        inOrder(head.left);
        System.out.print(head.data);
        inOrder(head.right);
    }

    static void postOrder(Node head){
        if (head==null) 
            return;
        postOrder(head.left);
        postOrder(head.right);
        System.out.print(head.data);
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.left=new Node(2);
        head.right=new Node(3);
        head.left.left=new Node(4);
        head.left.right=new Node(5);
        head.right.left=new Node(6);
        head.right.right=new Node(7);
        preOrder(head);

    }
}