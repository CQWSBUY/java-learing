package abstractobject;

import abstractobject.factory.AbstractFactory;
import abstractobject.factory.BenciCarFactory;
import factory.abstractobject.Car;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 15:00
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //工厂方法模式去掉了简单工厂模式中工厂方法的静态属性，使得它可以被子类继承。这
        //样在简单工厂模式里集中在工厂方法上的压力可以由工厂方法模式里不同的工厂子类来分
        //担。
        //四个重要角色 抽象工厂角色， 具体工厂角色，抽象产品角色 ，具体产品角色
        /*当有新的车型添加的时候，不需要修改以前的源码。更加符合开闭原则*/
       /*
          使用场景
            1) 当客户程序不需要知道要使用对象的创建过程。
            2) 客户程序使用的对象存在变动的可能，或者根本就不知道使用哪一个具体的对象。*/
        //存在的问题：
        //  1：当某个产品发生改变时，必须同时修改产品类和该产品对应的工厂类。
        //  2：当产品种类过多的时候，工厂类会变的很多。类爆炸。

        AbstractFactory carFactory = new BenciCarFactory();
        Car car = carFactory.createCar();

    }
}
