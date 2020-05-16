/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ekaranja
 */
public class SchoolManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/smsdatabase?useSSL=false";
        String dbUsername = "root";
        String dbPassword = "";
        String insertStudentQuery = "insert into students (name,registrationNumber,gender,course,phoneNumber,username,password)"
                + "values (?,?,?,?,?,?,?)";
        Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

        /**
         * select all students
         */
        String selectQuery = "select * from students";
        PreparedStatement selectPst = connection.prepareStatement(selectQuery);
        selectPst.executeQuery();
        ResultSet selectedRescords = selectPst.getResultSet();
        while (selectedRescords.next()) {
            System.out.println("Name " + selectedRescords.getString(2));
        }
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
        PreparedStatement insertPst = connection.prepareStatement(insertStudentQuery, Statement.RETURN_GENERATED_KEYS);
        insertPst.setString(1, name);
        insertPst.setString(2, registrationNumber);
        insertPst.setString(3, gender);
        insertPst.setString(4, course);
        insertPst.setString(5, phoneNumber);
        insertPst.setString(6, username);
        insertPst.setString(7, password);

        insertPst.executeUpdate();
        ResultSet rs = insertPst.getGeneratedKeys();
        if (rs.first()) {
            System.out.println("Your Account created Successfully " + rs.getInt(1));
        }

        /**
         * update the record after insert
         */
        System.out.println("Enter Id for the student to Update");
        String id = scanner.nextLine();
        System.out.println("Enter New Name");
        String newName = scanner.nextLine();
        String updateQuery = "update students set name =? where id=?";
        PreparedStatement updatePst = connection.prepareStatement(updateQuery);
        updatePst.setString(1, newName);
        updatePst.setInt(2, Integer.parseInt(id));
        updatePst.executeUpdate();

        /**
         * delete a student by ID
         */
        System.out.println("Enter Id for the student to Delete");
        String deleteID = scanner.nextLine();
        String deleteQuery = "delete from students where id=?";
        PreparedStatement deletePst = connection.prepareStatement(deleteQuery);
        deletePst.setInt(1, Integer.parseInt(deleteID));
        deletePst.executeUpdate();

    }

}
