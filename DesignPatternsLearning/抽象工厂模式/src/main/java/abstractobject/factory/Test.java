package abstractobject.factory;

import abstractobject.factory.abstractfactory.AbstractFactory;
import abstractobject.factory.factory.BrandFactory;
import abstractobject.factory.group.Brand;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 17:26
 */
public class Test {
    public static void main(String[] args) {
        /***
         *
         *当产品属于多个族时，且用户只会以某一族的方式使用产品时，可以使用抽象工厂方法模式
         *
         *
         *
         *
         *
         *
         *
         *
         *
         */

        AbstractFactory factory = new BrandFactory();
        Brand brandCar = factory.getBrandCar("benchi");
    }
}
