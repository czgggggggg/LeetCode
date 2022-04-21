package concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Code0001 {
    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(0);

        for(int i = 0; i < 100; i++){
            new Thread(() -> {
                for(int j = 0; j < 100; j++){
                    num.incrementAndGet();
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
