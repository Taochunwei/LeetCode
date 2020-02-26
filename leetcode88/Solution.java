/**
 * @author Taochunwei
 * @date 2020/2/24 - 19:43
 */
public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=m+n-1;
        int p1=m-1;
        int p2=n-1;
        while (p1>=0&&p2>=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[index]=nums1[p1];
                p1--;
                index--;
                continue;
            }else {
                nums1[index]=nums2[p2];
                p2--;
                index--;
                continue;
            }
        }
        if(p2<0)
            return;
        if(p1<0){
            while (p2>=0){
                nums1[index]=nums2[p2];
                index--;
                p2--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
    }
}
