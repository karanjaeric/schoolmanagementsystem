/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

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

        //create objects using new keywork.Invoke a no args constructor
        Student franc = new Student();
        franc.setName("Franc");
        franc.setGender("Male");
        franc.setUsername("franc123");
        franc.setPassword("123");
        franc.setPhoneNumber("25470234554");
        franc.setRegistrationNumber(1);
        //parameterized constructor
        Student elizabeth = new Student("Elizabeth Musanga", 2, null, "Female", "2545667875", "emusanga", "1234");

        System.out.println("Name=>" + franc.getName() + " Gender=>" + franc.getGender() + " Username=>" + franc.getUsername());
        System.out.println("Name=>" + elizabeth.getName() + " Gender=>" + elizabeth.getGender() + " Username=>" + elizabeth.getUsername());

    }

}
