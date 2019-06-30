package leetcode203;

/**
 * @author Taochunwei
 * @date 2019/6/30 - 18:34
 */
class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next=head;

        ListNode prev=dummyHead;
        while(prev.next!=null){
            if(prev.next.val==val){
                ListNode delNode=prev.next;
                prev.next = delNode.next;
                delNode.next=null;
            }
            else
                prev=prev.next;
        }
        return dummyHead.next;
    }
}