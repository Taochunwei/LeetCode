/**
 * @author Taochunwei
 * @date 2019/8/5 - 8:37
 */
public class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder newS=new StringBuilder();
        StringBuilder newT=new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)!='#')
                newS.append(S.charAt(i));
            else if(S.charAt(i)=='#'&&newS.length()>0)
                newS.deleteCharAt(newS.length()-1);
        }
        for (int i = 0; i < T.length(); i++) {
            if(T.charAt(i)!='#')
                newT.append(T.charAt(i));
            else if(T.charAt(i)=='#'&&newT.length()>0)
                newT.deleteCharAt(newT.length()-1);
        }
        if (newS.length()==newT.length()){
            for (int i = 0; i < newS.length(); i++) {
                if(newS.charAt(i)!=newT.charAt(i))
                    return false;
            }
        }else{
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.backspaceCompare("ab##","c#d#");
    }
}
