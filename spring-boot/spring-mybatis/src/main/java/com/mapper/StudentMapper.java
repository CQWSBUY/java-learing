package com.mapper;

import com.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    void addStudent(Student student);
}
