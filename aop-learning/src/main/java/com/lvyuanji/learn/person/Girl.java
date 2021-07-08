package com.lvyuanji.learn.person;

import com.lvyuanji.learn.actioninterface.IBuy;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/7 11:08
 */
@Component
public class Girl implements IBuy {
    @Override
    public void buy(double price) {
        System.out.println("女孩买了一条花裙子！花费了："+price+"元");
    }
}
