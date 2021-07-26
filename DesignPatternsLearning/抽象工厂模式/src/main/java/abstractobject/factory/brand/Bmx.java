package abstractobject.factory.brand;

import abstractobject.factory.group.Brand;

/**
 * 宝马
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 17:22
 */
public class Bmx implements Brand {
    @Override
    public void brandinfo() {
        System.out.println("宝马：副驾驶的妹子永远18岁！");
    }
}
