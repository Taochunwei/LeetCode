/**
 * @author Taochunwei
 * @date 2019/9/3 - 10:25
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int level=0;
        int vertical=0;
        for (int i = 0; i <moves.length() ; i++) {
            if(moves.charAt(i)=='R')
                level++;
            else if(moves.charAt(i)=='L')
                level--;
            else if(moves.charAt(i)=='U')
                vertical++;
            else if(moves.charAt(i)=='D')
                vertical--;
        }
        return level==0&&vertical==0;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.judgeCircle("UFCUDD"));
    }
}
