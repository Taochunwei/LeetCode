/**
 * @author Taochunwei
 * @date 2019/8/4 - 18:07
 */
import java.util.*;
public class Solution  {
    public boolean isHappy(int n) {
        if(n==1)
            return true;
        Set<Integer> map=new TreeSet<>();
        int mapnumber=n;
        int outnumber;
        while(mapnumber!=1){
           outnumber=caculate(mapnumber);
           if(map.contains(outnumber))
               return false;
            map.add(mapnumber);
            mapnumber=outnumber;
        }
        return true;
    }

    private int caculate(int n){
        int temp=n;
        int mid;
        int ret=0;
        while (temp>0){
            mid=temp%10;
            ret=ret+mid*mid;
            temp=temp/10;
        }
        return ret;
    }
}
