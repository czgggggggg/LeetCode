package test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/**
 * @Author czgggggggg
 * @Date 2021/12/9
 * @Description
 */
public class Test2 {
    public static void main(String[] args) {
        String path = "D:/ruoyi/uploadPath/1/.a2103f3f-86f2-4488-a4c4-1a6b81a9fddfsol";
        System.out.println(getFileMd5(path));
        String path2 = "D:/ruoyi/uploadPath/1/.56b74b9c-7ce6-4663-ae29-a022ae7fc6desol";
        System.out.println(getFileMd5(path2));
        String path3 = "D:/ruoyi/uploadPath/1/.1ee23940-00f6-4a6d-8856-c8da4d51bb33sol";
        System.out.println(getFileMd5(path3));
        String path4 = "C:\\Users\\12102\\Desktop\\4.sol";
        System.out.println(getFileMd5(path4));
    }

    public static String getFileMd5(String filename) {
        InputStream fis;
        byte[] buffer = new byte[1024];
        int numRead = 0;
        MessageDigest md5;
        try {
            fis = new FileInputStream(filename);
            md5 = MessageDigest.getInstance("MD5");
            while ((numRead = fis.read(buffer)) > 0) {
                md5.update(buffer, 0, numRead);
            }
            fis.close();
            return bytesToHexString(md5.digest());
        } catch (Exception e) {
            System.err.println("error");
            return null;
        }
    }

    public static String bytesToHexString(byte[] var0) {
        StringBuilder var1 = new StringBuilder("");
        if (var0 != null && var0.length > 0) {
            for(int var2 = 0; var2 < var0.length; ++var2) {
                String var3;
                if ((var3 = Integer.toHexString(var0[var2] & 255).toUpperCase()).length() < 2) {
                    var1.append(0);
                }
                var1.append(var3);
            }
            return var1.toString();
        } else {
            return null;
        }
    }
}
