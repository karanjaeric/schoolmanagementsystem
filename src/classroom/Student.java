/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

/**
 *
 * @author ekaranja
 */
public class Student extends Person{

    /**
     * Fields/properties
     */
    private Course course;
    private String phoneNumber;
    private String username;
    private String password;
    //parameterized constructor

    public Student() {
    }    

    public Student(String name,Course course, String phoneNumber, String username, String password) {
        this.course = course;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.setName(name);
    }
    

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" + "course=" + course + ", phoneNumber=" + phoneNumber + ", username=" + username + ", password=" + password + '}';
    }

 
    
}
