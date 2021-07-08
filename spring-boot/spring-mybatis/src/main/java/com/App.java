package com;

import com.pojo.Student;
import com.service.AddStudent;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@MapperScan("com.mapper")
public class App {
      public static void main(String[] args) {
          SpringApplication.run(App.class,args);
        }

}
