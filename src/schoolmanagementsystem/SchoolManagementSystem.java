/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import classroom.Course;
import classroom.Faculty;
import classroom.Student;

/**
 *
 * @author ekaranja
 */
public class SchoolManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Faculty faculty=new Faculty();
        faculty.setFacultyCode("C026");
        faculty.setFacultyCode("Computer Science & IT");
        
        Course bbit=new Course();
        bbit.setCourseCode("BBIT");
        bbit.setCourseName("Business Information Technology");
        bbit.setCourseYear(2020);
        bbit.setFaculty(faculty);

        //create objects using new keywork.Invoke a no args constructor
        Student franc = new Student();
        franc.setName("Franc");
        franc.setGender("Male");
        franc.setUsername("franc123");
        franc.setPassword("123");
        franc.setPhoneNumber("25470234554");
        franc.setRegistrationNumber(1);
        franc.setCourse(bbit);
        //parameterized constructor
        Student elizabeth = new Student("Elizabeth Musanga", 2, bbit, "Female", "2545667875", "emusanga", "1234");
        System.out.println(franc.toString());
        System.out.println(elizabeth.toString());

    }

}
