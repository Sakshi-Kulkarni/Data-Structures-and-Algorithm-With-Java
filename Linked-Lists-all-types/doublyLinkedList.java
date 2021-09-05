package DSA;
import java.util.*;
public class doublyLinkedList {
    // Node head;//head of doubly linked list

    // create one node of doubly linkedlist
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) {
            data = d;
        }

    }

    // Insert the node in doubly linkedlist
    // declare the head and tail of data as null
    Node head = null;
    Node tail = null;

    void insert(int new_data) {
        /*
         * 1. allocate node 2. put in the data
         */
        Node new_Node = new Node(new_data);
        // if list is empty
        if (head == null) {
            // both head and tail points to new_node
            head = tail = new_Node;
            // head's previous point to null
            head.prev = null;
            // tail's next will point to null as consider as it is last node of list
            tail.next = null;
        }
        else{
            
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next=new_Node;
            //new node's previous will point to tail
            new_Node.prev=tail;
            //new node will became new tail
            tail=new_Node;
            // as it is last node tail's next will point to null
            tail.next=null;
        }

    }
    public void display(){
        //node current will point to head
        Node current =head;
        if (head==null) {
            System.out.println("List is empty");
            return;
      
        }
        System.out.println("Nodes of Doubly linked list are as follows: ");
        while (current!=null) {
            //print each node by incrementing pointer 
            System.out.println(current.data+"");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        doublyLinkedList dll=new doublyLinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements you want to insert in list :");

        int num=sc.nextInt();
        //System.out.println("Add element:");
        for (int i = 0; i < num; i++) {
            System.out.println(
            "Add at position-" +i
            );
             int new_data=sc.nextInt();
            dll.insert(new_data);
        }
        dll.display();
        sc.close();
    }
}
