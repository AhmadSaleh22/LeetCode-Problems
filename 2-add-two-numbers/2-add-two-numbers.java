/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// to parse to int as asci code (int)
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode resultHead = new ListNode(0);
        ListNode resultIterator = resultHead;
        
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        boolean carry = false;
        
        while(pointer1 != null || pointer2 != null){
            int sum = 0;
            if(pointer1 == null){
                sum += pointer2.val;
                pointer2 = pointer2.next;
            }
            else if(pointer2 == null){
                sum += pointer1.val;
                pointer1 = pointer1.next;
            }
            else{
                sum = (pointer1.val + pointer2.val);
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
            
            if(carry){
                sum++;
            }
            if(sum >= 10) {
                sum %= 10;
                carry = true;
            }
            else{
                carry = false;
            }
            
            ListNode newNode = new ListNode(sum);
            resultIterator.next = newNode;
            resultIterator= resultIterator.next;
        }
        
        if(carry)
            resultIterator.next = new ListNode(1);
        
        
        return resultHead.next;
    }
}