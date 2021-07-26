package abstractobject;


/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/13 17:20
 */
public abstract class Car{
    private String carName;
    private String carType;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
