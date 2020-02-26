/**
 * @author Taochunwei
 * @date 2020/2/26 - 12:55
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        short[] freq=new short[256];
        int l=0,    r=-1;
        int res=0;
        while (l<s.length()){
            if(r+1<s.length()&&freq[s.charAt(r+1)]==0)
                freq[s.charAt(++r)]++;
            else
                freq[s.charAt(l++)]--;

            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
