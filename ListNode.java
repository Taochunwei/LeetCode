package leetcode203;

/**
 * @author Taochunwei
 * @date 2019/6/30 - 18:02
 */
public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
//这是一个ListNode的构造函数  并且以一个数组作为参数
      public ListNode(int[] arr){

          if(arr==null||arr.length==0){
              throw new IllegalArgumentException("arr can not be empty");
          }
          this.val = arr[0];
          ListNode cur=this;
          for (int i = 1; i < arr.length; i++) {
              cur.next=new ListNode(arr[i]);
              cur=cur.next;
          }
      }
      @Override
      public String toString(){
            StringBuilder res = new StringBuilder();
            ListNode cur=this;
            while(cur!=null){
                res.append(cur.val+"->");
                cur=cur.next;
            }
            res.append("NULL");
            return res.toString();

      }
  }