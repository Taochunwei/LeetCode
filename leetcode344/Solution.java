/**
 * @author Taochunwei
 * @date 2019/9/3 - 11:03
 */
public class Solution {
    public void reverseString(char[] s) {
        int N=s.length>>1;
        for (int i = 0,j=s.length-1; i <N ; i++,j--) {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        Solution test=new Solution();
        test.reverseString(s);
        System.out.println(s);

    }
}
