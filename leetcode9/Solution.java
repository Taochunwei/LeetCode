/**
 * @author Taochunwei
 * @date 2019/12/16 - 17:05
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x==0)
            return true;
        int xx=x;
        int ret=0;
        while (x>0){
            int temp=x%10;
            ret=ret*10+temp;
            x/=10;
        }
        return ret==xx?true:false;
    }
}
