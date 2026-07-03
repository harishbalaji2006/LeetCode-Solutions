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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        List<Integer> li = new ArrayList<>();
        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        ListNode h1 = new ListNode(0);
        ListNode t = h1;
        for(int i=li.size()/2;i<li.size();i++){
            t.next = new ListNode(li.get(i));
            t = t.next;
        }
        return h1.next;
    }
}