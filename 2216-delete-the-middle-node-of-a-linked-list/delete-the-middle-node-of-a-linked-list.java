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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        List<Integer> li = new ArrayList<>();
        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        int k = li.size() / 2;
        ListNode h1= new ListNode(0);
        ListNode t = h1;
        for(int i=0;i<li.size();i++){
            if(i != k){
                t.next = new ListNode(li.get(i));
                t = t.next;
            }
        }
        return h1.next;
    }
}