package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUpload {
    @ResponseBody
    @RequestMapping("/fileUpload")
    public String fileUpload(MultipartFile file){
        System.out.println(file.getName());
        System.out.println(file.getSize());
        return "success";
    }
}
