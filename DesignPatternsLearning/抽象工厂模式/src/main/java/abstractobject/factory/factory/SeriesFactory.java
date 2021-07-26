package abstractobject.factory.factory;

import abstractobject.factory.abstractfactory.AbstractFactory;
import abstractobject.factory.group.Brand;
import abstractobject.factory.group.Series;
import abstractobject.factory.series.Jiaoche;
import abstractobject.factory.series.Suv;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/23 8:52
 */
public class SeriesFactory extends AbstractFactory {
    @Override
    public Brand getBrandCar(String brand) {
        return null;
    }

    @Override
    public Series getSeries(String series){
        if("suv".equalsIgnoreCase(series)){
            return new Suv();
        }else if("jiaoche".equalsIgnoreCase(series)){
            return new Jiaoche();
        }else{
            return null;
        }
    }
}
