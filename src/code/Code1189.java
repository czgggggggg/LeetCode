package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/9
 * @Description
 */
public class Code1189 {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));//1
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));//2
        System.out.println(maxNumberOfBalloons("loonbalxballpon"));//1
        System.out.println(maxNumberOfBalloons("lonbalxballpn"));//0
        System.out.println(maxNumberOfBalloons("leetcode"));//0
        System.out.println(maxNumberOfBalloons("mbetypbpefxvviadqaodrbjeoacfomepmzymiudltgnvnpbowwmjgpzzhtiismearuwocsgbiimiqqzaozgeizikrlxmupfzjzmlfttqqbpfblqfkecsdfbsceqjhubfxksivrfwvukapxmuciybfhzlmpeamdxziptxregymqtmgcsujmugissgnlbhxbcxxeoumcqyulvahuianbaaxgzrtmshjguqdaxvxndzoqvwmcjfhpevavnrciqbymnlylbrfkkiceienoarfrzzxtuaqapaeqeqolozadmtgjyhfqzpuaskjuawxqkdqyjqcmbxtvshzrquvegcuyuckznspmrxvqdassidcmrajedsnuuumfwqzvasljlyvfefktiqgvzvdzojtjegsyhbepdkuwvgrfscezvswywmdavpxlekbrlkfnbyvlobazmvgulxrfdranuhomkrlpbfeagfxxxuhjuqhbkhznixquxrxngwimdxdhqbdaouitsvcdmbwxbbaomkgxsqwnexbjjyhtxvkjfqkrrxjghvzqsattubphryqxxdyjkihfnzvjhohnhdlfwoqiwtmwzfgcyhyqtcketvgnbchcxvnhcsoosirfqgdgcsitegzlxdfijzmxnvhrulmgvoqfpzesootscnxenokmmozmoxpaverydbsnimwacjqhrtxkqtvghjyushoctxphxzztukgmnoeycqaeukymvwxcsyvvctflqjhtcvjtxncuvhkptkjnzaetwbzkwnseovewuhpkaxiphdicgacszzdturzgjkzwgkmzzavykancvvzaafgzjhcyicorrblmhsnnkhfkujttbkuuedhwguuaapojmnjdfytdhrepjwcddzsoeutlbbljlikghxefgbqenwamanikmynjcupqpdjnhldaixwygcvsgdkzszmsptqqnroflgozblygtiyaxudwmooiviqcosjfksnevultrf"));
        //14
    }
    public static int maxNumberOfBalloons(String text) {
        int b_count = 0;
        int a_count = 0;
        int l_count = 0;
        int o_count = 0;
        int n_count = 0;

        char ch;
        for(int i = 0; i < text.length(); i++){
            ch = text.charAt(i);
            if(ch == 'b')
                b_count++;
            else if(ch == 'a')
                a_count++;
            else if(ch == 'l')
                l_count++;
            else if(ch == 'o')
                o_count++;
            else if(ch == 'n')
                n_count++;
        }

        int min = Integer.MAX_VALUE;
        min = Math.min(b_count, min);
        min = Math.min(a_count, min);
        min = Math.min(l_count / 2, min);
        min = Math.min(o_count / 2, min);
        min = Math.min(n_count, min);

        return min;
    }
}
//balloon