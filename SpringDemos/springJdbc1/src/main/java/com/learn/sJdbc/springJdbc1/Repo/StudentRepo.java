package com.learn.sJdbc.springJdbc1.Repo;

import com.learn.sJdbc.springJdbc1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jt;

    public JdbcTemplate getJt() {
        return jt;
    }

    @Autowired
    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    //To give students data to DB
    public void save(Student s) {

        String sql="insert into student (rollno, name, marks) values (?,?,?)";
        int row=jt.update(sql,s.getRollNo(),s.getName(),s.getRollNo());
        System.out.println(row+ "  effected ");
    }

    //To ask DB to provide Student data
    public List<Student> findAll() {

        String sql="select * from student";

        RowMapper<Student> mapper=new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student s=new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };


       return jt.query(sql,mapper);
    }
}
