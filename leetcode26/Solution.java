/**
 * @author Taochunwei
 * @date 2019/12/5 - 21:03
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        int k=0;//nums[0...k]的元素是不重复的
        for (int i = 1; i <length ; i++) {
            if(nums[i]!=nums[k]){
                nums[++k]=nums[i];
            }
        }
        return k+1;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int ret=s.removeDuplicates(nums);

        System.out.println(ret);
    }
}
