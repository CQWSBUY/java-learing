package gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/5 15:41
 */

@RestController
public class TestController {
    //通过网关访问  http://localhost:8849/test/hello
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello Sentinel";
    }
}
