package dsa.BinarySearchTree;

public class SearchAndDelete {
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
    Node insertNode(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else if(data<root.data)
            {root.left=insertNode(root.left, data);}
        else if(data>root.data)
            {root.right=insertNode(root.right, data);}
        return root;
    }

    void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    // Node searchNode(Node root, int key){
    //     if(root==null)
    //         return null;
    //     else if(root.data==key)
    //     {
    //         return root;
    //     }
    //     else if (root.data>key){
    //        return searchNode(root.left, key);
    //     }
    //     return searchNode(root.right, key);
    // }

    Node searchNDeletNode(Node root, int key){
        if(root==null)
            return null;
        else if(root.left.data==key||root.right.data==key)
        {
            System.out.println("Found at left");
            return root;
        }
        else if (root.data>key){
           return searchNDeletNode(root.left, key);
        }
        return searchNDeletNode(root.right, key);
    }
    
    void delete(Node node, int data){
    if(node.left.data==data){
        if(node.left.left==null||node.left.right==null)
            node.left=node.left.left;
        else{
            Node node1= node.left;
            Node node2= node.left.right;
            node1.data=node2.data;
            node1.right=null;
        }

    }
    else if(node.right.data==data){
        if(node.left.left==null||node.left.right==null)
            node.right=node.right.right;
        else{
            Node node1=node.right;
            Node node2=node.right.right;
            Node temp=node1;
            node1=node2;
            node2=temp;
            node1.right=null;
        }
    }        

    }
    public static void main(String[] args) {
        int arr[]={3,2,7,1,5,8,4,6};
        Node root=null;
        SearchAndDelete obj= new SearchAndDelete();
        for (int i = 0; i < arr.length; i++) {
          root=obj.insertNode(root, arr[i]);
        }
        System.out.println("--------------------------------");
        obj.inOrder(root);
        System.out.println("\n--------------------------------");
        Node node=obj.searchNDeletNode(root, 5);
        obj.delete(node,5);
        System.out.println("After deletion");
        obj.inOrder(root);
        System.out.println("\n--------------------------------");
    }
    
}
