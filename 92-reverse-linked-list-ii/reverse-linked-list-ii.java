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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        int[] arr = new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i] = li.get(i);
        }
        int i = left-1,j = right-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        ListNode h1 = new ListNode(0);
        ListNode t1 = h1;
        for(int num : arr){
            t1.next = new ListNode(num);
            t1 = t1.next;
        }
        return h1.next;
    }
}