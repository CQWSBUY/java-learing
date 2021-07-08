package com.Controller;

import com.pojo.Student;
import com.service.AddStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUpload {

    @Autowired
    private AddStudent addStudent;

    @ResponseBody
    @RequestMapping("/fileUpload")
    public String fileUpload(MultipartFile file){
        System.out.println(file.getName());
        System.out.println(file.getSize());
        return "success";
    }

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("張三");
        student.setSex("男");
        addStudent.addStudent(student);
        System.out.println("我執行完成了");
        return "success";
    }
}
