package com.lvyuanji.learn;

import com.lvyuanji.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/9 13:42
 */
@Controller
public class TestError {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/testError")
    String testError() throws Exception {
        if(true){
            throw new MyException(10000,"我的自定义异常！");
        }
        return null;
    }

    @RequestMapping("/testOtherError")
    String testOtherError() throws Exception {
        if(true){
            throw new Exception("我是其他异常！");
        }
        return null;
    }
}
