package factory.abstractobject.factory;

import factory.abstractobject.Car;
import factory.abstractobject.entity.BENCHICar;
import factory.abstractobject.entity.BMWCar;
import factory.abstractobject.entity.DAZHONGCar;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 14:57
 */
public class CarFactory {
    public static Car createCar(String carName) throws Exception {
        if("奔驰".equals(carName)){
            return new BENCHICar();
        }else if("宝马".equals(carName)){
            return new BMWCar();
        }else if("大众".equals(carName)){
            return new DAZHONGCar();
        }else throw new Exception();
    }
}
