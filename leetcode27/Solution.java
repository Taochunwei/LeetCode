/**
 * @author Taochunwei
 * @date 2019/11/9 - 11:53
 */
public class Solution {
    static public int removeElement(int[] nums, int val) {
        int retcount=nums.length;//nums[retcount....nums.length-1]都是val
        int i=0;//nums[0..i)  !=val
        while (i<retcount){
            while (retcount>=1&&nums[retcount-1]==val) {
                retcount--;
            }
            if(retcount==0||retcount==i)
                return retcount;
            if(nums[i]==val){
                swap(nums,i,--retcount);
            }
            i++;
        }
        return retcount;
    }
    static private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums={2,2,3};
        int val=2;
        removeElement(nums,val);
    }
}
