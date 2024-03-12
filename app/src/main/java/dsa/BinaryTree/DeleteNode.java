package dsa.BinaryTree;
public class DeleteNode {
    private class Node {
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node insert(Node head, int data){
        if(head==null) 
            return new Node(data);
        else if(data<head.data)
            head.left=insert(head.left, data);
        else
            head.right=insert(head.right, data);
        return head;
    }

    public void inOrderTraversal(Node head){
        if(head==null)
            return;
        inOrderTraversal(head.left);
        System.out.print(head.data+" ");
        inOrderTraversal(head.right);
    }


    public Node delete(Node head, int data){
        if(head==null)
            return null;
        Node temp=head;
        while (head!=null) {
            if (data>head.data) {
                if(head.right!=null && head.right.data==data){
                    head.right= helper(head.right);
                    break;
                }
                else{
                    head=head.right;
                }
            }
            else{
                if(head.left==null&&head.left.data==data){
                    head.left=helper(head.left);
                    break;
                }
                else{
                    head=head.left;
                }

            }
        }
        return temp;
    }

    public Node helper(Node head){
        if(head.left==null)
            return head.right;
        else if( head.right==null)
            return head.left;
        Node rightMost= getRightMost(head.left);
        rightMost.right=head.right;
        return head.left;

    }

    public Node getRightMost(Node head){
        if(head.right==null)
            return head;
        return getRightMost(head.right);
    }
    public static void main(String[] args) {
        int arr[]={8,3,10,1,6,9,14,4,7,13,5};
        DeleteNode obj= new DeleteNode();
        Node headNode=null;
        for (int i : arr) {
            headNode=obj.insert(headNode, i);
        }
        obj.inOrderTraversal(headNode);
        System.out.println();
        headNode=obj.delete(headNode, 6);
        obj.inOrderTraversal(headNode);
    }
}
