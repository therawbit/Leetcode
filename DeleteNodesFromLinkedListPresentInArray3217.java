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
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        ListNode temp = head;
        ListNode previous = head;
        while (temp != null){
            if(set.contains(temp.val)){
                if(temp == head){
                    head = temp.next;
                }else{
                    previous.next = temp.next;
                }
            }else{
            previous = temp;
            }
            temp = temp.next;
        }
        return head;
        
    }
}
