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
    public ListNode swapPairs(ListNode head) {
        List<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        for(int i=0;i<li.size()-1;i+=2){
            int k = li.get(i);
            li.set(i,li.get(i+1));
            li.set(i+1,k);
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