package abstractobject.factory.factory;

import abstractobject.factory.abstractfactory.AbstractFactory;
import abstractobject.factory.brand.Benci;
import abstractobject.factory.brand.Bmx;
import abstractobject.factory.group.Brand;
import abstractobject.factory.group.Series;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/23 8:52
 */
public class BrandFactory extends AbstractFactory {
    @Override
    public Brand getBrandCar(String brand){
        if ("奔驰".equals(brand)){
            return new Benci();
        }else if("宝马".equals(brand)){
            return new Bmx();
        }else{
            return null;
        }
    }

    @Override
    public Series getSeries(String series) {
        return null;
    }
}
