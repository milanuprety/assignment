/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Display;

import com.leapfrog.DAO.CourseDAO;
import com.leapfrog.DAOImpl.CourseDAOImpl;
import com.leapfrog.Entity.Course;
import java.util.Scanner;

/**
 *
 * @author milan
 */
public class FourthMenu {

    public static void menu4() {
        Scanner input = new Scanner(System.in);
        CourseDAO courseDAO = new CourseDAOImpl();
        int a=1;
        while (a==1) {
            System.out.println("****MENU ---> Course****");
            System.out.println("1. Add  Course ID and Name");
            System.out.println("2. Delete records");
            System.out.println("3. Show All");
            System.out.println("4. Search by ID");
            System.out.println("5. Search by Name");
            System.out.println("6. Go back");
            System.out.print("Enter your choice [1-6]: ");
            switch (input.nextInt()) {
                case 1:
                    Course s = new Course();
                    System.out.println("Enter  CourseID");
                    s.setCourseId(input.nextInt());
                    System.out.println("Enter Course Name");
                    s.setCourseName(input.next());
                    courseDAO.insert(s);
                    break;
                case 2:
                    System.out.println("Enter id of student to be delated:");
                    boolean b = courseDAO.delete(input.nextInt());
                    if (b == false) {
                        System.out.println("Record not found");
                    }
                    break;
                case 3:
                    courseDAO.getAll().forEach(ss -> {
                        System.out.println(ss.toString());
                    });
                    break;
                case 4:
                    System.out.println("Enter id of student to be searched:");
                    courseDAO.getById(input.nextInt());
                    break;
                case 5:
                    System.out.println("Enter name of student to be searched:");
                    courseDAO.search(input.next());
                    break;

                case 6:
                    a=2;
                    break;
            }
           
        } // while loop end
    }

}
