/**
 * @author Taochunwei
 * @date 2020/2/25 - 17:53
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int[] ret=new int[2];
        while (i<j){
            if(numbers[i]+numbers[j]>target){
                j--;
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else break;
        }
        ret[0]=i+1;
        ret[1]=j+1;
        return ret;
    }
}
