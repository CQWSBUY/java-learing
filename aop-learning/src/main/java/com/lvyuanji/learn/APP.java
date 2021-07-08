package com.lvyuanji.learn;

import com.lvyuanji.learn.config.Appconfig;
import com.lvyuanji.learn.person.Boy;
import com.lvyuanji.learn.person.Girl;
import com.lvyuanji.learn.pojo.Goods;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/7 10:30
 */
public class APP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Boy boy = context.getBean("boy",Boy.class);
        Goods goods = new Goods();
        goods.setName("水枪");
 //       boy.buyGoods(goods);
        boy.buyForOtherPeople(boy,goods);
        /*boy.buy(20D);
        Girl girl = context.getBean("girl", Girl.class);
        girl.buy(30D);*/
    }
}
