package leetcode349;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author Taochunwei
 * @date 2019/7/10 - 20:13
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:nums1){
            set.add(num);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:nums2){
            if(set.contains(num)){
                res.add(num);
                set.remove(num);}
        }
        int[] out=new int[res.size()];
        for(int i=0;i<res.size();i++){
            out[i]=res.get(i);
        }
        return out;
    }
}
