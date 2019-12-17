/**
 * @author Taochunwei
 * @date 2019/12/17 - 21:37
 */
import java.util.Stack;
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));}
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty()&&stack.peek()=='(')
                    stack.pop();
                else return false;
            } else if(s.charAt(i)=='}'){
                if(!stack.isEmpty()&&stack.peek()=='{')
                    stack.pop();
                else return false;
            } else if(s.charAt(i)==']'){
                if(!stack.isEmpty()&&stack.peek()=='[')
                    stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
