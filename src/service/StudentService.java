/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import classroom.Student;
import java.util.List;

/**
 *
 * @author ekaranja
 */
public class StudentService implements StudentsServiceI {

    @Override
    public List<Student> addStudents(List<Student> students, List<Student> newStudents) {
        students.addAll(newStudents);
        return students;
    }

}
