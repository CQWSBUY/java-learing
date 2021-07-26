package abstractobject.factory.series;

import abstractobject.factory.group.Series;

/**
 * suv
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 17:23
 */
public class Suv implements Series {
    @Override
    public void seriesInfo() {
        System.out.println("底盘高，空间大！");
    }
}
