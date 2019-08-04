/**
 * @author Taochunwei
 * @date 2019/8/4 - 19:33
 */
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }
}
