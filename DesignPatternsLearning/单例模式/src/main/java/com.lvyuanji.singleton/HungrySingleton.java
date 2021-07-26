package main.java.com.lvyuanji.singleton;

/**
 * //饿汉式
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/23 10:25
 */
public class HungrySingleton {
    private HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {
    }

    public HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
