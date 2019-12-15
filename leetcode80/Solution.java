/**
 * @author Taochunwei
 * @date 2019/12/15 - 12:10
 * 这道题的关键就是nextIndex()函数的实现，返回值的意义要保持统一：下一个新数字的地址，如果
 * 到了数组末尾，那么返回值应该是nums.length，这样子 len 就可以保持意义不变。
 * 这道题目中，i 并不是简单的 i++ ，而是每一次循环都会根据数组内容进行不同的赋值，所以在这种情况
 * 下，while循环要比for循环更加直接
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)
            return nums.length;
        int k=0;//nums[0...k)是只重复一次的
        int i=0;
        int nextIndex=0;//nums[nextIndex]是第一个下一个数字
        while (i<nums.length){
            nextIndex=nextIndex(nums,i);
            int len=Math.min(2,nextIndex-i);
            for(int ii=0;ii<len;ii++){
                nums[k+ii]=nums[i];
            }
            k+=len;
            i=nextIndex;
        }
        return k;
    }
//nums[i] 是第一次出现这个数字，返回值i是下一个数字的第一个数字
//如果已经到数组结尾了  就返回数组的长度
    private int nextIndex(int[] nums, int index){
        for (int i = index; i <nums.length ; i++) {
            if(nums[i]!=nums[index])
                return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1};
        Solution s= new Solution();
        int out=s.removeDuplicates(nums);
        System.out.println(out);
    }
}
