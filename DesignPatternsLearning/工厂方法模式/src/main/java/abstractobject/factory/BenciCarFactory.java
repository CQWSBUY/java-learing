package abstractobject.factory;

import factory.abstractobject.Car;
import factory.abstractobject.entity.BENCHICar;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 14:57
 */
public class BenciCarFactory implements AbstractFactory {

    public Car createCar() {
        return new BENCHICar();
    }
}
