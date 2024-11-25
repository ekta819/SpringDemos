package com.learn.sJdbc.springJdbc1.service;

import com.learn.sJdbc.springJdbc1.Repo.StudentRepo;
import com.learn.sJdbc.springJdbc1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    //To give students data to repo
    public void addStudent(Student s){
        repo.save(s);

    }

    //To ask repo to provide Student data
    public List<Student> getStudents() {
        return repo.findAll();
    }
}
