/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DAO;

import com.leapfrog.Entity.Employee;
import java.util.List;

/**
 *
 * @author milan
 */
public interface EmployeeDAO {
    
    boolean insert(Employee a);
    boolean delete(String name);
    List<Employee> getAll();
    List<Employee> search(String name);
    
     
}
