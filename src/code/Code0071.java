package code;

public class Code0071 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));//    /home
        System.out.println(simplifyPath("/../"));//    /
        System.out.println(simplifyPath("/home//foo/"));//    /home/foo
        System.out.println(simplifyPath("/a/./b/../../c/"));//    /c
        System.out.println(simplifyPath("/a/./b/../../../c/"));//    /c
        System.out.println(simplifyPath("//////a/./b///../../c/..//////"));//    /
        System.out.println(simplifyPath("/../../../../c/./././d/./././e/../"));//    /c/d

        System.out.println(simplifyPath("///TJbrd/owxdG//"));//    /TJbrd/owxdG
    }
    public static String simplifyPath(String path) {
        int n = path.length();
        if(n == 1){
            return path;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n - 1; i++){
            if(!(path.charAt(i) == path.charAt(i + 1) && path.charAt(i) == '/')){
                sb.append(path.charAt(i));
            }
        }
        if(!(path.charAt(n - 2) != path.charAt(n - 1) && path.charAt(n - 1) == '/')){
            sb.append(path.charAt(n - 1));
        }

        if(sb.toString().startsWith("/")){
            sb.deleteCharAt(0);
        }
        String[] strs = sb.toString().split("/");
        int i = 0;
        int j = 0;
        while (j < strs.length){
            if("..".equals(strs[j])){
                if(i > 0){
                    i--;
                }
            }else if(".".equals(strs[j])){

            }else{
                strs[i] = strs[j];
                i++;
            }
            j++;
        }

        StringBuffer res = new StringBuffer();
        if(i == 0){
            return "/";
        }
        for(int t = 0; t <= i - 1; t++){
            res.append("/");
            res.append(strs[t]);
        }

        return res.toString();
    }
}

//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//225 / 257
//输入：
//"///TJbrd/owxdG//"
//输出：
//"//TJbrd/owxdG"
//预期结果：
//"/TJbrd/owxdG"