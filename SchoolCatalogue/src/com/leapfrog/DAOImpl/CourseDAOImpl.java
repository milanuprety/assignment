/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DAOImpl;

import com.leapfrog.DAO.CourseDAO;
import com.leapfrog.Entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milan
 */
public class CourseDAOImpl implements CourseDAO{
    
    private List<Course> courseList= new ArrayList<>();

    @Override
    public boolean insert(Course a) {
     return courseList.add(a);
    }

    @Override
    public boolean delete(int id) {
        Course s=getById(id);
        
       if(s!=null){
          return courseList.remove(s);
       }
       return false;
    
    }

    @Override
    public List<Course> getAll() {
    return courseList;  
    }

    @Override
    public Course getById(int id) {
     for(Course s : courseList){
         if(s.getCourseId()==id){
             System.out.println(s.toString());
             return s ;
         }
     }
     return null;
    }

    @Override
    public List<Course> search(String name) {
    List<Course> mycourseList= new ArrayList<>();
    for(Course s : courseList){
        if(s.getCourseName().contains(name)){
            System.out.println(s.toString());
            mycourseList.add(s);
        }
    }
     return mycourseList;
    }
}
