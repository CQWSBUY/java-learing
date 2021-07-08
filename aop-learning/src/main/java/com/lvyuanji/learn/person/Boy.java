package com.lvyuanji.learn.person;

import com.lvyuanji.learn.actioninterface.IBuy;
import com.lvyuanji.learn.pojo.Goods;
import com.lvyuanji.learn.testannotation.TestAnnotation;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/7 11:08
 */
@Component
public class Boy implements IBuy {
    @TestAnnotation
    @Override
    public void buy(double price) {
        System.out.println("男孩买了一个玩具枪！花费："+price+"元");
    }
    @TestAnnotation
    public void buyGoods(Goods goods){
        System.out.println("男孩买了一个商品！商品名："+goods.getName());
    }

    @TestAnnotation
    public void buyForOtherPeople(Boy boy,Goods goods){
        System.out.println("男孩买了一个商品！商品名："+goods.getName());
    }
}
