package DSA;
import java.io.*;
public class REverseLinkedlistI {
    static Node head;
   static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    } 
    Node reverse(Node node){
        Node previous=null;
        Node current=node;
        Node next=null;
        while (current !=null) {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        node=previous;
        return node;
    }
    void printlist(Node node){
        while (node != null){
            System.out.println(node.data+"");
            node=node.next;
        }
    }
    public static void main(String[] args) {
        REverseLinkedlistI list=new REverseLinkedlistI();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(90);

        System.out.println("Given Linked list");
        list.printlist(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printlist(head);
    }
}
