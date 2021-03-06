/**
 * @author Taochunwei
 * @date 2019/8/9 - 10:43
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode cur=head;
        while (cur.next!=null){
            if(cur.val==cur.next.val){
                if(cur.next.next!=null)
                    cur.next=cur.next.next;
                else cur.next=null;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }

    private void printListNode(ListNode head){
        if(head==null)
            return;
        ListNode cur=head;
        while (cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
    private ListNode creatListNode(int[] arr,int n){
        ListNode head=new ListNode(arr[0]);
        ListNode cur=head;
        for (int i = 1; i <n ; i++) {
            cur.next=new ListNode(arr[i]);
            cur=cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={1,1,2,3,3};
        ListNode head=s.creatListNode(arr,arr.length);
        s.deleteDuplicates(head);
        s.printListNode(head);
    }
}