/**
 * @author Taochunwei
 * @date 2020/2/26 - 9:50
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0)
            return 0;
        int retmin=Integer.MAX_VALUE;
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            sum[i]=sum[i-1]+nums[i];
        }
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <=i ; j++) {
                int sum_compare=sum[i]-sum[j]+nums[j];

                if(sum_compare>=s)
                    retmin=Math.min(retmin,i-j+1);
            }
        }
        return retmin!=Integer.MAX_VALUE?retmin:0;
    }
}
