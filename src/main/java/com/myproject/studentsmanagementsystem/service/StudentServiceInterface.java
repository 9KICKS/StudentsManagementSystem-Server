package com.myproject.studentsmanagementsystem.service;

import com.myproject.studentsmanagementsystem.model.Student;

import java.util.List;

public interface StudentServiceInterface {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
