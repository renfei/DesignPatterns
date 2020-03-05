package net.renfei.designpatterns.singleton;

/**
 * 懒汉单例模式
 *
 * @author RenFei
 */
public class LazySingleton {
    /**
     * 保证 instance 在所有线程中同步
     */
    private static volatile LazySingleton instance = null;

    /**
     * private 构造方法保证外部无法实例化
     */
    private LazySingleton() {
    }

    /**
     * synchronized 保证线程安全
     */
    public static synchronized LazySingleton getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
