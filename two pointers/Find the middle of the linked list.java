public class Solution {
    /**
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        // write your code here
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){ //condition in while is the success condition you want to loop to reach
                                            //fast.next==null is for when the length of the linked list is even
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
}
