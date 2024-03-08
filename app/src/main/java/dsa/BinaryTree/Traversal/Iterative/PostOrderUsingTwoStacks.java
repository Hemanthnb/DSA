package dsa.BinaryTree.Traversal.Iterative;

import java.util.*;

import dsa.BinaryTree.NodeClass.Node;

public class PostOrderUsingTwoStacks {


    static void postOrderTraversal(Node root) {
        if (root == null)
            return;
        Stack<Node> stk1 = new Stack<>();
        Stack<Node> stk2 = new Stack<>();
        stk1.push(root);
        while (!stk1.isEmpty()) {
            Node temp = stk1.pop();
            stk2.push(temp);
            if (temp.left != null)
                stk1.push(temp.left);
            if (temp.right != null)
                stk1.push(temp.right);
        }
        while (!stk2.isEmpty()) {
            System.out.print(stk2.pop().data + " ");
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
        postOrderTraversal(root);
    }

}