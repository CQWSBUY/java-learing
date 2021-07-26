package factory.abstractobject;

import factory.abstractobject.factory.CarFactory;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 15:00
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //简单工厂:简单工厂模式又称静态工厂方法模式。重命名上就可以看出这个模式一定很简单。它存
        //        在的目的很简单：定义一个用于创建对象的接口。
        //        缺点：1：当需要新增车型时，需要修改工厂源代码。不完全满足开闭原则
        //      简单工厂中的三个角色：工厂类角色，抽象产品角色，具体产品角色
        /*简单工厂解决的问题：
        *    1：客户端的压力较小，客户端不需要做创建实例的操作，
        *       只需要调用工厂类中的方法就可以获得对应实例
        *    2：解决了坏味道代码问题(老板坐上了奔驰车告诉实际开奔驰车)
        *
        *
        *
        * */
        CarFactory carFactory = new CarFactory();
        Car dazhongCar = carFactory.createCar("大众");

    }
}
