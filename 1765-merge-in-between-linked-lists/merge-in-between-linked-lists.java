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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode temp1 = list2;
        List<Integer> li = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        while(temp != null) {
            li.add(temp.val);
            temp = temp.next;
        }
        for(int i=0;i<a;i++){
            res.add(li.get(i));
        }
        while(temp1 != null) {
            res.add(temp1.val);
            temp1 = temp1.next;
        }
        for(int i=b+1;i<li.size();i++){
            res.add(li.get(i));
        }
        ListNode h1 = new ListNode(0);
        ListNode t1 = h1;
        for(int i=0;i<res.size();i++){
            t1.next = new ListNode(res.get(i));
            t1 = t1.next;
        }
        return h1.next;
    }
}