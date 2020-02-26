/**
 * @author Taochunwei
 * @date 2020/2/26 - 11:58
 */
public class Solution3 {
    public int minSubArrayLen(int s, int[] nums){
        if(nums.length==0)
            return 0;
        int l=0,    r=-1;
        int sum=0;
        int ret=nums.length+1;
        while (l<nums.length){
            if(r+1<nums.length&&sum<s)
                sum+=nums[++r];
            else
                sum-=nums[l++];

            if(sum>=s)
                ret=Math.min(ret,r-l+1);
        }
        if(ret==nums.length+1)
            return 0;
        return ret;
    }

    public static void main(String[] args) {
        Solution3 s =new Solution3();
        int[] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(s.minSubArrayLen(target,nums));
    }
}
