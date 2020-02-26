/**
 * @author Taochunwei
 * @date 2020/2/25 - 20:34
 */
public class Solution {
    public int maxArea(int[] height) {
        int maxarea=0; int l=0;  int r=height.length-1;
        while (l<r){
           maxarea=Math.max(maxarea,(r-l)*Math.min(height[l],height[r]));
           if(height[l]<height[r])
               l++;
           else r--;
        }
        return maxarea;
    }
}
