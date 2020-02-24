/**
 * @author Taochunwei
 * @date 2020/2/24 - 14:26
 */
public class Solution {
    public void sortColors(int[] nums) {
        int[] count=new int[3];
        for (int i = 0; i <nums.length ; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i <count[0] ; i++) {
            nums[i]=0;
        }
        for (int i = count[0]; i <count[1]+count[0] ; i++) {
            nums[i]=1;
        }
        for (int i = count[1]+count[0]; i <nums.length ; i++) {
            nums[i]=2;
        }
    }

}
