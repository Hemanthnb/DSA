package dsa.BinaryTree.Traversal.Iterative;

import java.util.*;

import dsa.BinaryTree.NodeClass.Node;

public class Inorder {
   
    static void inOrder(Node root) {
        if (root == null)
            return;
        Stack<Node> stk = new Stack<>();
        while (!stk.isEmpty() || root != null) {
            if (root != null) {
                stk.push(root);
                root = root.left;
            } else if (!stk.isEmpty()) {
                root = stk.pop();
                System.out.print(root.data + " ");
                root = root.right;
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.left.right = new Node(8);
        root.left.right.left.right.left = new Node(9);
        inOrder(root);
    }

}