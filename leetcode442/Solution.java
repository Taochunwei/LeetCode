/**
 * @author Taochunwei
 * @date 2019/8/31 - 8:11
 */
import java.util.*;
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            while (nums[i]!=i+1){
                if(nums[i]==nums[nums[i]-1]){
                    if(!res.contains(nums[i])){
                    res.add(nums[i]);
                    }
                    break;
                }else {
                    swit(nums,nums[i]-1,i);
                }
            }
        }
        return res;
    }
    private void swit (int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(s.findDuplicates(arr));
    }
}
