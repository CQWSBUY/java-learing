package com.serviceimpl;

import com.mapper.StudentMapper;
import com.pojo.Student;
import com.service.AddStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddStudentImpl implements AddStudent {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }
}
