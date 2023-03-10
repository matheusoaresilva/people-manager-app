package com.matheus.peoplemanager.service;

import com.matheus.peoplemanager.exception.UserNotFoundException;
import com.matheus.peoplemanager.model.Student;
import com.matheus.peoplemanager.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student){
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepo.save(student);
    }

    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }

    public Student findStudentById(Long id){
        return studentRepo.findStudentById(id)
                .orElseThrow(() ->new UserNotFoundException("User by id: " + id + " was not found"));
    }

    public void deleteStudent(Long id){
        studentRepo.deleteById(id);
    }
}
