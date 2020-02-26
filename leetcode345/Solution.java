/**
 * @author Taochunwei
 * @date 2020/2/25 - 19:54
 */
public class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j){
            char c1=ch[i];
            char c2=ch[j];
            if(!isVowels(c1)){
                i++;
                continue;
            }
            if(!isVowels(c2)){
                j--;
                continue;
            }
            ch[i++]=c2;
            ch[j--]=c1;
        }
        return new String(ch);
    }

    private boolean isVowels(char c){
        char s=Character.toLowerCase(c);
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
            return true;
        return false;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        String str="hello";
        System.out.println(s.reverseVowels(str));
    }
}
