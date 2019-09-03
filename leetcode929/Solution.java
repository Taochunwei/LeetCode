/**
 * @author Taochunwei
 * @date 2019/9/3 - 15:11
 */
import java.util.HashSet;
import java.util.Set;
public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> res=new HashSet<>();
        for(String email:emails){
            int i=email.indexOf('@');
            String local=email.substring(0,i);
            String rest=email.substring(i);
            if(local.contains("+")){
                local=local.substring(0,local.indexOf('+'));
            }
            while (local.contains(".")){
                local=local.replace(".","");
            }
            res.add(local + rest);
        }
        return res.size();
    }
    public static void main(String[] args) {
        Solution s= new Solution();
        String str[]={"test+email@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(s.numUniqueEmails(str));
    }
}
