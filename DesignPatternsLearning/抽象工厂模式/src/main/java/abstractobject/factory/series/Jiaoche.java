package abstractobject.factory.series;

import abstractobject.factory.group.Series;

/**
 * 轿车
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 17:24
 */
public class Jiaoche implements Series {
    @Override
    public void seriesInfo() {
        System.out.println("轿车：舒适底板低！");
    }
}
