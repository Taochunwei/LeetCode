/**
 * @author Taochunwei
 * @date 2020/2/26 - 15:23
 */
import java.util.*;
import java.util.List;
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        char [] sChar = s.toCharArray();
        char [] pChar = p.toCharArray();
        short [] sfreq = new short[26];
        short [] pfreq = new short[26];
        for (char c:pChar) {
            pfreq[c-'a']++;
        }
        for (int i = 0; i <sChar.length ; i++) {
            if(i>=p.length())
                sfreq[sChar[i-pChar.length]-'a']--;

            sfreq[sChar[i]-'a']++;

            if(Arrays.equals(sfreq,pfreq))
                result.add(i-pChar.length+1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="cbaebabacd";
        String p="abc";
        System.out.println(solution.findAnagrams(s,p));
    }
}
