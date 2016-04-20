/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Display;

import com.leapfrog.DAO.StudentDAO;
import com.leapfrog.DAOImpl.StudentDAOImpl;
import com.leapfrog.Entity.Student;
import java.util.Scanner;

/**
 *
 * @author milan
 */
public class SecondaryMenu {

    public static void menu2() {
        Scanner input = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAOImpl();
        int a =1;
        while( a == 1){
        System.out.println("****MENU--->Student****");
        System.out.println("1. Add ID and Name");
        System.out.println("2. Delete records");
        System.out.println("3. Show All");
        System.out.println("4. Search by ID");
        System.out.println("5. Search by Name");
        System.out.println("6. Go back");
        System.out.print("Enter your choice [1-6]: ");
        switch (input.nextInt()) {
            case 1:
                Student s= new Student();
                System.out.println("Enter ID");
                s.setId(input.nextInt());
                System.out.println("Enter First name");
                s.setFirstName(input.next());
                System.out.println("Enter Last Name");
                s.setLastName(input.next());
                studentDAO.insert(s);
                break;
            case 2:
                System.out.println("Enter id of student to be delated:");
                boolean b = studentDAO.delete(input.nextInt());
                if(b==false){
                    System.out.println("Record not found");
                    
                }
                break;
            case 3:
                studentDAO.getAll().forEach(ss->{
                    System.out.println(ss.toString());
                });
                break;
            case 4:
                 System.out.println("Enter id of student to be searched:");
                 studentDAO.getById(input.nextInt());
                 
                
                break;
            case 5:
                System.out.println("Enter name of student to be searched:");
                studentDAO.search(input.next());
                break;
            case 6:
                a=2;
                break;
        }
    } // while loop end
}
}
