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
    static class Pair {
        Node node;
        int state;
        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {

        Integer [] arr = {10,40,30,null,null,40,null,null};

        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
        st.push(rtp);
        int idx = 0;
        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                idx = idx +1;
                top.state++;
                if( idx < arr.length &&  arr[idx] != null){
                    Node t = new Node(arr[idx], null, null);
                    top.node.left = t;
                    Pair lp = new Pair(t, 1);
                    st.push(lp);
                }else {
                    top.node.left = null;
                }
            }else if(top.state == 2){
                idx = idx +1;
                top.state++;
                if( idx < arr.length && arr[idx] != null){
                    Node t = new Node(arr[idx], null, null);
                    top.node.right = t;
                    Pair lp = new Pair(t, 1);
                    st.push(lp);
                }else {
                    top.node.right = null;
                }
            }else {
                st.pop();
            }
        }
        display(root);
    }
    static void display(Node root){
        if(root == null){
            return ;
        }
//        System.out.print(root.data + " ");
        display(root.left);

        display(root.right);
        System.out.print(root.data + " ");
    }
}
