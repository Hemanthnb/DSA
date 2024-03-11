package dsa.BinarySearchTree;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}
public class DeleteNodeInBST {

    static void inOrderTraversal(Node root){
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    static Node deleteNode(int data, Node root){
        if(data>root.data){
            root.right=deleteNode(data, root.right);
        }
        else if(data<root.data){
            root.left= deleteNode(data, root.left);
        }
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else{
                Node successorParent= root;
                Node successorChild= root.right;
                while(successorChild.left!=null){
                    successorParent=successorChild;
                    successorChild=successorChild.left;
                }
                root.data=successorChild.data;
                if(successorParent==root){
                   root.right=successorChild.right;   
                }
                else{
                    successorParent.left=successorChild.right;
                }
            }
        }
        return root;
    }

    static void levelOrderTraversal(Node root){
        if(root == null)
            return;
        Queue<Node>queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node temp=queue.poll();
            if(temp!=null){
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)   
                    queue.add(temp.right);
            }
            else if(!queue.isEmpty()) {
                queue.add(null);   
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Node root= new Node(26);
        root.left=new Node(10);
        root.right=new Node(35);
        root.left.left=new Node(9);
        root.left.right= new Node(14);
        root.left.right.left=new Node(12);
        root.left.right.left.left= new Node(11);
        root.left.right.right=new Node(18);
        root.left.right.right.left= new Node(17);
        root.left.right.right.left.left= new Node(16);
        root.left.right.right.left.left.left= new Node(15);
        root.left.right.right.right=new Node(25);
        root.left.right.right.right.left=new Node(22);
        root.left.right.right.right.left.right=new Node(23);
        root.left.right.right.right.left.right.right=new Node(24);

        // inOrderTraversal(root);
        // System.out.println();
        // levelOrderTraversal(root);
        deleteNode(14, root);
        System.out.println();
        levelOrderTraversal(root);

    }
}
