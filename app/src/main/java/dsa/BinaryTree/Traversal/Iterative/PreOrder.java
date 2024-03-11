package dsa.BinaryTree.Traversal.Iterative;

import java.util.*;

import dsa.BinaryTree.NodeClass.Node;

public class PreOrder {

    static void preOrder(Node root) {
        if (root == null)
            return;
        Stack<Node> stk = new Stack<>();
        Node ptr = root;
        stk.push(ptr);
        while (stk.size() > 0) {
            ptr = stk.pop();
            System.out.print(ptr.data + " ");
            if (ptr.right != null)
                stk.push(ptr.right);
            if (ptr.left != null)
                stk.push(ptr.left);
        }
        System.out.println(ptr.data);

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
        preOrder(root);
    }

}