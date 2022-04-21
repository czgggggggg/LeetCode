package concurrent;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Code0002 {
    volatile static int num = 0;

    public static void main(String[] args) {
        Object obj = new Object();

        for(int i = 0; i < 100; i++){
            new Thread(() -> {
                for(int j = 0; j < 100; j++){
                    synchronized(obj){
                        num++;
                    }
                }
            }).start();
        }

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(num);
    }
}
