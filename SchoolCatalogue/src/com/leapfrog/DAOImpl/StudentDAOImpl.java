/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DAOImpl;

import com.leapfrog.DAO.StudentDAO;
import com.leapfrog.Entity.Student;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author milan
 */
public class StudentDAOImpl implements StudentDAO{
    
    private List<Student> studentList= new ArrayList<>();

    @Override
    public boolean insert(Student a) {
     return studentList.add(a);
    }

    @Override
    public boolean delete(int id) {
        Student s=getById(id);
        
       if(s!=null){
          System.out.println("Successfully Deleted");
          return studentList.remove(s);
       }
       return false;
    
    }

    @Override
    public List<Student> getAll() {
    return studentList;  
    }

    @Override
    public Student getById(int id) {
     for(Student s : studentList){
         if(s.getId()==id){
             System.out.println(s.toString());
             return s ;
         }
     }
     return null;
    }

    @Override
    public List<Student> search(String name) {
    List<Student> mystudentList= new ArrayList<>();
    for(Student s : studentList){
        if(s.getFirstName().contains(name)){
            mystudentList.add(s);
            System.out.println(s.toString());
        }
    }
     return mystudentList;
    }
    
}
