import java.util.*;
public class Main {
    static class Node {
       int data;
       Node left;
       Node right;
       Node(int data, Node left, Node right) {
           this.data = data;
           this.left = left;
           this.right = right;
       }
    }

    static Node contructBST(int arr[], int low, int high){
        if(low > high){
            return null;
        }
        int mid = (low + high) / 2;
        int data = arr[mid];
        Node left = contructBST(arr, low, mid - 1);
        Node right = contructBST(arr, mid + 1, high);
        Node node = new Node(data, left, right);
        return node;
    }

    public static void main(String[] args) {

        int [] arr = {10 , 15 , 20,  25, 30, 35, 40, 45,50};
        Node root = contructBST(arr, 0, arr.length - 1);
        display(root);
    }
    static void display(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);

    }
}
