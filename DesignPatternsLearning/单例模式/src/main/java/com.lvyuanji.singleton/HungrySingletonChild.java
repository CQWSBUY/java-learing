package main.java.com.lvyuanji.singleton;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/23 10:52
 */
public class HungrySingletonChild extends HungrySingletonFather{
    public HungrySingletonChild() {
    }
    static public HungrySingletonChild getInstance() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
      //  return (SingletonChild1)Singleton.getInstance("SingletonChild1");
        return (HungrySingletonChild)HungrySingletonFather.getInstance("HungrySingletonChild");
    }
}
