package abstractobject.factory.abstractfactory;

import abstractobject.factory.group.Brand;
import abstractobject.factory.group.Series;

public abstract class AbstractFactory {
    public abstract Brand getBrandCar(String brand);
    public abstract Series getSeries(String series);
}
