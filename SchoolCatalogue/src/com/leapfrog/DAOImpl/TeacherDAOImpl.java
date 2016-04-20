/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DAOImpl;

import com.leapfrog.DAO.TeacherDAO;
import com.leapfrog.Entity.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milan
 */
public class TeacherDAOImpl implements TeacherDAO {

    private List<Teacher> teacherList= new ArrayList<>();

    @Override
    public boolean insert(Teacher a) {
     return teacherList.add(a);
    }

    @Override
    public boolean delete(int id) {
        Teacher s=getById(id);
        
       if(s!=null){
          return teacherList.remove(s);
       }
       return false;
    
    }

    @Override
    public List<Teacher> getAll() {
    return teacherList;  
    }

    @Override
    public Teacher getById(int id) {
     for(Teacher s : teacherList){
         if(s.getId()==id){
             System.out.println(s.toString());
             return s ;
         }
     }
     return null;
    }

    @Override
    public List<Teacher> search(String name) {
    List<Teacher> myteacherList= new ArrayList<>();
    for(Teacher s : teacherList){
        if(s.getFirstName().contains(name)){
            myteacherList.add(s);
            System.out.println(s.toString());
        }
    }
     return myteacherList;
    }
}
