package dsa.BinaryTree;
import java.util.*;

public class BuildTreeUsingArray {
    Node root;

    BuildTreeUsingArray(){
        this.root=null;
    }

    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    void insert(int data){
        if(root==null){
            root= new Node(data);
            return;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp=queue.poll();
            if(temp.left==null){
                temp.left= new Node(data);
                break;
            }
            else{
                queue.add(temp.left);
            }
            if(temp.right==null){
                temp.right= new Node(data);
                break;
            }
            else{
                queue.add(temp.right);
            }
        }
    }

    void preOrderTraversal(Node rootNode){
        if(rootNode==null){
            return;
        }
        System.out.print(rootNode.data+" ");
        preOrderTraversal(rootNode.left);
        preOrderTraversal(rootNode.right);
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        BuildTreeUsingArray obj= new BuildTreeUsingArray();
        for (int i : arr) {
            obj.insert(i);
        }
        obj.preOrderTraversal(obj.root);
        
    }
}
