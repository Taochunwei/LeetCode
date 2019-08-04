/**
 * @author Taochunwei
 * @date 2019/8/4 - 19:46
 */
import java.util.TreeMap;
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||nums.length==1)
            return false;

        if(k<=0)
            return false;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k)
                return true;

            map.put(nums[i],i);
        }
        return false;
    }
}
