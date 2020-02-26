/**
 * @author Taochunwei
 * @date 2020/2/25 - 19:29
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<=j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(!Character.isDigit(c1)&&!Character.isAlphabetic(c1)){
                i++;
                continue;
            }
            if(!Character.isDigit(c2)&&!Character.isAlphabetic(c2)){
                j--;
                continue;
            }
            if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        String string="race a car";
        s.isPalindrome(string);
    }
}
