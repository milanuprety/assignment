/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.primary;

import com.leapfrog.DAO.EmployeeDAO;
import com.leapfrog.DAOImpl.EmployeeDAOImpl;
import com.leapfrog.Entity.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author milan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        EmployeeDAO employeedao = new EmployeeDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Add from File");
            System.out.println("2. Add a record");
            System.out.println("3. Delete by Name");
            System.out.println("4. Show all record");
            System.out.println("5. Search by Name");
            System.out.println("6. Copy all to File");
            System.out.println("7. Exit");

            System.out.print("Enter your Choice[1-6]");
            switch (input.nextInt()) {
                case 1:
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("f:/new.txt"));
                        int i = 0;
                        String line = "";
                        while ((line = reader.readLine()) != null) {
                            Employee employee = new Employee();
                            String[] tokens = line.split(",");
                            employee.setId(tokens[0]);
                            employee.setFirstName(tokens[1]);
                            employee.setLastName(tokens[2]);
                            employee.setEmail(tokens[3]);
                            employee.setSalary(tokens[4]);
                            employeedao.insert(employee);

                        }
                        reader.close();

                    } catch (IOException ioe) {
                        ioe.getMessage();
                    }
                    break;
                case 2:
                    Employee employee = new Employee();
                    System.out.println("Enter Id");
                    employee.setId(input.next());
                    System.out.println("Enter First Name");
                    employee.setFirstName(input.next());
                    System.out.println("Enter Last Name");
                    employee.setLastName(input.next());
                    System.out.println("Enter eMail");
                    employee.setEmail(input.next());
                    System.out.println("Enter Salary");
                    employee.setSalary(input.next());
                    employeedao.insert(employee);
                    break;
                case 3:
                    System.out.println("Enter Name to delete");
                    employeedao.delete(input.next());
                    break;
                case 4:
                    employeedao.getAll().forEach(s -> {
                        System.out.println(s.toString());
                    });
                    break;
                case 5:
                    System.out.println("Enter Name to Search");
                    employeedao.search(input.next());
                    break;
                case 6:
                    try {
                        FileWriter writer = new FileWriter("f:/new_updated.txt");
                        String content = "";
                        
//                employeedao.getAll().forEach(s->{
//                content = content + s.toString();
//                });
                        
                        for (Employee e : employeedao.getAll()) {
                            content = content + e.toString() + "\r\n";
                        }

                        writer.write(content);
                        writer.close();
                    } catch (IOException ioe) {
                        System.out.println(ioe.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Program Stopping ...");
                    System.exit(0);
                    break;

            }

        }

    }
}
