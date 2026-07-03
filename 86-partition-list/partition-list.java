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
class Solution {
    public ListNode partition(ListNode head, int x) {
        List<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                li.add(temp.val);
            }
            temp = temp.next;
        }
        ListNode temp1 = head;
        while(temp1 != null){
            if(temp1.val >= x){
                li.add(temp1.val);
            }
            temp1 = temp1.next;
        }
        ListNode h1 = new ListNode(0);
        ListNode t = h1;
        for(int n : li){
            t.next = new ListNode(n);
            t = t.next;
        }
        return h1.next;
    }
}