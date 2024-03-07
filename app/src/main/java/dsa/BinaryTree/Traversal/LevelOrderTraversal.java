package dsa.BinaryTree.Traversal;
 import java.util.*;
import dsa.BinaryTree.NodeClass.Node;

public class LevelOrderTraversal {

   public static ArrayList<ArrayList<Integer>> levelOrderTraversal(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        if(root==null)
            return ans;
        Queue<Node>queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);
        ArrayList<Integer>arr= new ArrayList<>();
        while (!queue.isEmpty()) {
            Node tempnode=queue.poll();
            if(tempnode!=null){
                arr.add(tempnode.data);
                if(tempnode.left!=null)
                    queue.add(tempnode.left);
                if(tempnode.right!=null)
                    queue.add(tempnode.right);
            }
            else if(!queue.isEmpty()){
                queue.add(null);
                ans.add(arr);
                arr=new ArrayList<>();
            }
        }
        if(arr.size()!=0)
            ans.add(arr);
        return ans;


    }

    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        ArrayList<ArrayList<Integer>>arr= levelOrderTraversal(root);
        System.out.println(arr);
    }
}