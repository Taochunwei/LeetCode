/**
 * @author Taochunwei
 * @date 2019/11/7 - 20:25
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;//nums[0....k)中全不为零

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0)
                nums[k++]=nums[i];
        }
        for (int i=k; i <nums.length ; i++) {
            nums[i]=0;
        }
    }
}
