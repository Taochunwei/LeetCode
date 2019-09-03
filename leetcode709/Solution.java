/**
 * @author Taochunwei
 * @date 2019/9/3 - 10:06
 */
public class Solution {
    public String toLowerCase(String str) {
        StringBuilder  res=new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            res.append((char)(str.charAt(i)-('A'-'a')));
            else
                res.append(str.charAt(i));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.toLowerCase("Hello"));
    }
}
