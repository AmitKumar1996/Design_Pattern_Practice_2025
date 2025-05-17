package linkedList;

//Definition for singly-linked list
class ListNode {
 int val;
 ListNode next;

 // Constructors
 ListNode(int val) {
     this.val = val;
     this.next = null;
 }

 ListNode(int val, ListNode next) {
     this.val = val;
     this.next = next;
 }
}

public class Main {
 public static void main(String[] args) {
     // Step 1: Create nodes
     ListNode node3 = new ListNode(3);
     ListNode node2 = new ListNode(2, node3);
     ListNode node1 = new ListNode(1, node2);

     // head points to the first node
     ListNode head = node1;

     // Step 2: Print the linked list
     System.out.println("Linked List:");
     printList(head);
 }

 // Method to print the linked list
 public static void printList(ListNode head) {
     ListNode current = head;
     while (current != null) {
         System.out.print(current.val + " → ");
         current = current.next;
     }
     System.out.println("null");
     
     System.out.println(head.val+" head: " + head);
     System.out.println(head.next.val+" head.next: " + head.next);
     System.out.println(head.next.next.val+" head.next.next: " + head.next.next);
     System.out.println(head.next.next.next.val+" head.next.next.next: " + head.next.next.next);
     
 }
}
