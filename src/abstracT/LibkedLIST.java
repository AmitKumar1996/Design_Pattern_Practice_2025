package abstracT;

import java.util.Arrays;
import java.util.LinkedList;

public class LibkedLIST {

    // ---------------- Problem 1 ----------------------
    // Given an array where every element appears twice except one.
    // Find the element that appears only once.
    // Input = {1,1,3,3,2,2,5,7,7} -> Output = 5
    public static void findSingleElement() {
        int A[] = {1, 1, 3,7,7};
        int ans = A[0];

        for (int i = 1; i < A.length; i++) {
            ans ^= A[i];  // XOR cancels out duplicates
        }
        System.out.println("Unique element: " + ans);
    }
//    
//    0 1
//    0 1
//  --------
//    0  0
//    1  1
//   ---------- 
//   0 1  1
//   1 1  1
//  -----------
//   1  0    0
//   1  1    1
//   ----------
//   0  1     1
//   
     // ---------------- Problem 2 ----------------------
    // Merge two sorted linked lists into one sorted list.
    // Input: list1 = [1,2,4], list2 = [1,3,4]
    // Output:- [1,1,2,3,4,4]
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // ---------------- Problem 3 ----------------
    // Move all zeros to the end of the array (keeping order of non-zero).
    // Input: [0,1,0,3,12] -> Output: [1,3,12,0,0]
    public static void moveZeros() {
        int A[] = {0, 1};   //  0 1
        int index = 0;
        
        int end=A.length-1;
        
        System.out.println(A.length);
        
        System.out.println(end);

        // First pass: move non-zeros forward
        for (int i = 0; i < A.length;i++ ) {
            if (A[i] != 0) {
                A[index++] = A[i];
               
            }
          
        }
       

        // Fill rest with zeros
	        while (index < A.length) {
	           A[index++] = 0;
	       
	        }

        System.out.println("After moving zeros: " + Arrays.toString(A));
        
    }

    // ---------------- Main ----------------
    public static void main(String[] args) {

        // Problem 1: Unique element using XOR
        findSingleElement();

        // Problem 2: Merge two sorted linked lists
        Node l1 = new Node(1);
        l1.next = new Node(2);
       
        l1.next.next = new Node(4);
        l1.next.next.next=new Node(6);

        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(4);

        Node merged = mergeTwoLists(l1, l2);
        System.out.print("Merged Linked List: ");
        printList(merged);

        // Problem 3: Move zeros to end
        moveZeros();
    }
}
