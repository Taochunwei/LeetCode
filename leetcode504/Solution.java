/**
 * @author Taochunwei
 * @date 2019/8/9 - 16:59
 */
public class Solution {
    public String convertToBase7(int num) {
        StringBuilder ret=new StringBuilder();
        if (num==0)
            return ret.append("0").toString();
        int n=Math.abs(num);
        while (n>0){
            ret.append(n%7);
            n/=7;
        }

        return num>0?ret.reverse().toString():ret.append("-").reverse().toString();
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.convertToBase7(-654));
    }
}
