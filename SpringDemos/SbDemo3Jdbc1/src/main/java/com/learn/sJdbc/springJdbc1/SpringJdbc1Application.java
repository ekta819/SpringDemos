package com.learn.sJdbc.springJdbc1;

import com.learn.sJdbc.springJdbc1.model.Student;
import com.learn.sJdbc.springJdbc1.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJdbc1Application.class, args);
		Student s=context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Ekta");
		s.setMarks(78);

		//To give students data to service
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		////To ask Service to provide Student data
		List<Student> students= service.getStudents();
		System.out.println(students);

	}

}
