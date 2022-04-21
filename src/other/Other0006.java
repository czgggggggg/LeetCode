package other;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Other0006 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true
    }
}

//懒汉模式（非线程安全）
//class Singleton{
//    private static Singleton instance;
//
//    private Singleton(){
//
//    }
//
//    public static Singleton getInstance(){
//        if(instance == null)
//            instance = new Singleton();
//        return instance;
//    }
//}

//懒汉模式（线程安全）
//class Singleton{
//    private static Singleton instance;
//
//    private Singleton(){
//
//    }
//
//    public static synchronized Singleton getInstance(){
//        if(instance == null)
//            instance = new Singleton();
//        return instance;
//    }
//}

//饿汉模式
//class Singleton{
//    private static Singleton instance = new Singleton();
//
//    private Singleton(){
//
//    }
//
//    public static Singleton getInstance(){
//        return instance;
//    }
//}

//双重校验锁DCL（线程安全）
class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null)//第一次校验，如果创建成功则不需要走代码块，所以不需要做同步处理
            synchronized(Singleton.class){
                if(instance == null){//第二次校验，在对象未创建时，此时的判断必须保证只能一个线程进入，否则可能会在第一个线程进入未创建完成，紧接着第二个线程进入再进行构建
                    instance = new Singleton();
                }
            }
        return instance;
    }
}