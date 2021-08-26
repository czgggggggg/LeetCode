package array;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array929 {
    public static void main(String[] args) {
        String[] emails1 = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails1));
    }
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> emailSet = new HashSet<>();
        for(int i = 0; i < emails.length; i++){
            String[] split = emails[i].split("@");
            String str = "";
            for(int j = 0; j < split[0].length(); j++){
                char ch = split[0].charAt(j);
                if(ch == '+')
                    break;
                if(ch != '.')
                    str += ch;
            }
            str += '@';
            str += split[1];
            emailSet.add(str);
//            System.out.println(str);
        }
        return emailSet.size();
    }
}
