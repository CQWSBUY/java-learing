package com.lvyuanji.singleton;

import java.util.HashMap;

/**
 * //饿汉式
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/23 10:25
 */
public class HungrySingletonFather {

    //用来存放对应关系
    private static HashMap sinRegistry = new HashMap();
    static private HungrySingletonFather s = new HungrySingletonFather();
    protected HungrySingletonFather() {
    }

    public static HungrySingletonFather getInstance(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if(name == null){
            name = "HungrySingletonFather";
        }
        if(sinRegistry.get(name) == null){
            sinRegistry.put(name,Class.forName("main.java.com.lvyuanji.singleton."+name).newInstance());
        }
        return (HungrySingletonFather) sinRegistry.get(name);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        HungrySingletonFather hungrySingletonFather = HungrySingletonFather.getInstance("HungrySingletonChild");
        System.out.println(hungrySingletonFather.getClass().toString());
        main.java.com.lvyuanji.singleton.HungrySingletonChild hungrySingletonChild = main.java.com.lvyuanji.singleton.HungrySingletonChild.getInstance();
        System.out.println(hungrySingletonChild);
    }
}
