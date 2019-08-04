/**
 * @author Taochunwei
 * @date 2019/8/4 - 20:22
 */
import java.util.HashMap;
public class Solution2 {

    /// Using Hash Map
/// Time Complexity: O(n)
/// Space Complexity: O(n)


        public boolean containsNearbyDuplicate(int[] nums, int k) {

            if(nums == null || nums.length <= 1)
                return false;

            if(k <= 0)
                return false;

            HashMap<Integer, Integer> record = new HashMap<>();
            record.put(nums[0], 0);
            for(int i = 1; i < nums.length; i ++){
                if(record.containsKey(nums[i]) && i - record.get(nums[i]) <= k)
                    return true;

                record.put(nums[i], i);
            }

            return false;
        }
}
