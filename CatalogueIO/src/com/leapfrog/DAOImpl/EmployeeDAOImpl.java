/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DAOImpl;

import com.leapfrog.DAO.EmployeeDAO;
import com.leapfrog.Entity.Employee;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milan
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public boolean insert(Employee a) {
        return employeeList.add(a);
    }

    @Override
    public boolean delete(String name) {
        for (Employee e : employeeList) {
            if (e.getFirstName().contains(name)) {
                employeeList.remove(e);
                System.out.println("Succesfully Deleted.");
                return true;

            }
        }
        System.out.println("Record Not found");
        return false;
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public List<Employee> search(String name) {
        List<Employee> myList = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getFirstName().contains(name)) {
                myList.add(e);
                e.toString();

            }
        }

        return myList;
    }
}
