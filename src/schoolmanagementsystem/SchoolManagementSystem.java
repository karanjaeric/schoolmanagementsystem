/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import classroom.Course;
import classroom.Faculty;
import classroom.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import service.StudentService;
import service.StudentsServiceI;

/**
 *
 * @author ekaranja
 */
public class SchoolManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        //Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Student Name");
        String name = scanner.nextLine();

        System.out.println("Enter Your Reg No");
        String registrationNumber = scanner.nextLine();

        System.out.println("Enter Your Gender");
        String gender = scanner.nextLine();

        System.out.println("Enter Your Course");
        String course = scanner.nextLine();

        System.out.println("Enter Your Phone Number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Your Username");
        String username = scanner.nextLine();

        System.out.println("Enter Your Password");
        String password = scanner.nextLine();

        /**
         * include jdbc driver in my project. connect to database create an
         * insert statement create a prepared statement set parameters execute.
         *
         */
        String url = "jdbc:mysql://localhost:3306/smsdatabase?useSSL=false";
        String dbUsername = "root";
        String dbPassword = "";
        String insertStudentQuery = "insert into students (name,registrationNumber,gender,course,phoneNumber,username,password)"
                + "values (?,?,?,?,?,?,?)";
        Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
        PreparedStatement insertPst = connection.prepareStatement(insertStudentQuery);
        insertPst.setString(1, name);
        insertPst.setString(2, registrationNumber);
        insertPst.setString(3, gender);
        insertPst.setString(4, course);
        insertPst.setString(5, phoneNumber);
        insertPst.setString(6, username);
        insertPst.setString(7, password);

        insertPst.executeUpdate();

    }

}
