/**
 * @author Taochunwei
 * @date 2020/2/25 - 10:16
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {

        return _findKthLargest(nums,k,0,nums.length-1);
    }


    private int _findKthLargest(int[] nums, int k, int l, int r){
        int index=_partition(nums,l,r);
        if(index+1==k)  return nums[index];
        if(index+1<k)   return _findKthLargest(nums,k,index+1,r);
        if(index+1>k)   return _findKthLargest(nums,k,l,index-1);
        return -1;
    }

//_partition 返回一个index使得nums[l...index] 都大于等于nums[index]
    private int _partition(int[] nums, int l, int r){
        int j=r;
        //nums[r...i)>=nums[r]。nums(j..r]<nums[r]
        int i=l+1;
        while (i<=j){
            if(nums[i]>=nums[l]){
                i++;
            }else {
                swap(nums,i,j);
                j--;
            }
        }
        swap(nums,l,j);
        return j;
    }

    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        Solution s =new Solution();
        int[] nums= {2,3,1,5,6,4};
        System.out.println(s.findKthLargest(nums,2));
    }
}
