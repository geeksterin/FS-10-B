import java.util.*;
public class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addFirst(int data) {
            Node temp = new Node(data);
            if(size==0){
                head  = temp;
                tail = temp;
                size++;
            }else {
               temp.next = head;
               head = temp;
               size++;
            }
        }
        void addLast(int data) {
            Node temp = new Node(data);
            if(size==0){
                head  = temp;
                tail = temp;
                size++;
            }else {
                tail.next = temp;
                tail = temp;
                size++;
            }
        }
        void removeFirst(){
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                head = null;
                tail = null;
                size--;
            }else {
                head = head.next;
                size--;
            }
        }
        void removeLast(){
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                head = null;
                tail = null;
                size--;
            }else {
                Node temp = head;
                while (temp.next.next !=null){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            }
        }
        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        boolean isEmpty(){
            return size==0;
        }
        int size(){
            return size;
        }


    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(8);


    }
}
