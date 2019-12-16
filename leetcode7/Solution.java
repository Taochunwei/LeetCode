/**
 * @author Taochunwei
 * @date 2019/12/16 - 16:39
 */
public class Solution {
    public int reverse(int x) {
        if(x==0)
            return 0;
        int sign=x>0? 1:-1;
        x=Math.abs(x);
        long ret=0;
        while (x>0){
            int temp=x%10;
            ret=ret*10+temp;
            x/=10;
        }
        ret*=sign;
        if(ret>Integer.MAX_VALUE||ret<Integer.MIN_VALUE)
            return 0;
        return (int)ret;
    }
}
