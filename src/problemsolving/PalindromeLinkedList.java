package problemsolving;

import java.util.HashSet;
import java.util.Set;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        PLL p = new PLL();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(p.isPalindrome(head));
    }
}

//Definition for singly-linked list.
 class ListNode {
    int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class PLL {
    public boolean isPalindrome(ListNode head) {
        int count = 1;
        if(head.next == null) return true;
        if(head.next.next != null){
            ListNode slow = head;
            ListNode fast = head.next.next;
            while(fast != null && fast.next != null){
                // slow = slow.next;
                fast = fast.next.next;
                count++;
            }
            if(fast == null) count = count * 2;
            else count = (count * 2) - 1;
            int[] a = new int [count];
            int j = 0;
            while(slow != null){
                a[j] = slow.val;
                j++;
                slow = slow.next;
            }
            for(int i = 0; i < count/2; i++){
                if(a[i] != a[count -1 - i]) return false;
            }
            return true;
        }
        else{
            if(head.val == head.next.val) return true;
            return false;
        }
    }

}