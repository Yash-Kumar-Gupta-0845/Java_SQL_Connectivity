package org.example;

import java.sql.SQLException;
import java.util.List;
public class StudentDao {
    void addStudent(Student newStudent) throws SQLException{}

    void updateStudent(Student updateStudent) throws SQLException {}

    void deleteStudent(int id) throws SQLException{}
    List<Student> getStudent() throws SQLException{
        return null;
    }
    Student getStudentbyId(int id) throws SQLException{
        return null;
    }
}
