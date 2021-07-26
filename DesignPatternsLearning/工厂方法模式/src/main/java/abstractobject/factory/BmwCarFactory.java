package abstractobject.factory;

import abstractobject.entity.BMWCar;
import factory.abstractobject.Car;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 16:06
 */
public class BmwCarFactory implements AbstractFactory {
    public Car createCar() {
        return new BMWCar();
    }
}
