package net.renfei.designpatterns.singleton;

/**
 * 饿汉单例模式
 *
 * @author RenFei
 */
public class HungrySingleton {
    /**
     * 类一旦加载就创建一个单例
     */
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * private 构造方法保证外部无法实例化
     */
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
