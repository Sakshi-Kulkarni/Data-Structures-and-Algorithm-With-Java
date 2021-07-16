package DSA;
import java.util.*;
public class ReverseLinkedListRecurssion {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data= d;
            next=null;
        }
    }
    Node reverse(Node head){
        if (head == null || head.next == null)
        return head;

    /* reverse the rest list and put
    the first element at the end */
    Node rest = reverse(head.next);
    head.next.next = head;

    /* tricky step -- see the diagram */
    head.next = null;

    /* fix the head pointer */
    return rest;
    }
    
}
