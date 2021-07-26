package main.java.com.lvyuanji.singleton;

/**
 * 饱汉式
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/23 10:44
 */
public class FullSingleton {
    private static FullSingleton fullSingleton = null;

    private FullSingleton() {
    }

    public static synchronized FullSingleton getFullSingleton(){
        if(fullSingleton == null){
            fullSingleton = new FullSingleton();
        }
        return fullSingleton;
    }
}
