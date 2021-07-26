package abstractobject.factory.brand;

import abstractobject.factory.group.Brand;

/**
 * 奔驰
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 17:23
 */
public class Benci implements Brand {
    @Override
    public void brandinfo() {
        System.out.println("奔驰车：世界最早的汽车！");
    }
}
