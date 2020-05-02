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
public class Course {
    //Course properties
    private String courseCode;
    private String courseName;
    private Faculty faculty;
    private int courseYear;
    
    //getters and setters

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", faculty=" + faculty + ", courseYear=" + courseYear + '}';
    }
    
    
    
}
