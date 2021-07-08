package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetJSP {
    @RequestMapping("/getJSP")
    public String GetJsp(){
        return "testJsp";
    }
}
