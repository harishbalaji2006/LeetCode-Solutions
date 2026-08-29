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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = head;
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        for(int i : nums) hs.add(i);
        ListNode h1 = new ListNode(0);
        ListNode t1 = h1;
        while(temp != null) {
            if(!hs.contains(temp.val)) {
                li.add(temp.val);
            }
            temp = temp.next;
        }
        for(int i : li) {
            t1.next = new ListNode(i);
            t1 = t1.next;
        }
        return h1.next;
    }
}