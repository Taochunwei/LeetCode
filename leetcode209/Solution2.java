/**
 * @author Taochunwei
 * @date 2020/2/26 - 10:17
 */
public class Solution2 {
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
            int low=loewerbound(sum,0,sum.length-1,s+sum[i]-nums[i]);
            if(low!=-1){
                retmin=Math.min(retmin,low-i+1);
            }
        }
        return retmin!=Integer.MAX_VALUE?retmin:0;
    }
    private int loewerbound(int[] sums, int l, int r, int target){
        while (l!=r){
            int mid=l+(r-l)/2;
            if(sums[mid]>=target){
                if(sums[mid-1]<target)
                    return mid;
                else{
                    r=mid;
                    continue;
                }
            }else {
                l=mid;
                continue;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s =new Solution();
        int[] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(s.minSubArrayLen(target,nums));

    }
}
