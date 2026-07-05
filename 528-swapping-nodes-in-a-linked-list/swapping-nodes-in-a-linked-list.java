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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        List<Integer> li = new ArrayList<Integer>();
        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        int f = li.get(k-1);
        int s = li.get(li.size()-k);
        li.set(k-1,s);
        li.set(li.size()-k,f);
        ListNode h1 = new ListNode(0);
        ListNode t = h1;
        for(int n : li){
            t.next = new ListNode(n);
            t = t.next;
        }
        return h1.next;
    }
}