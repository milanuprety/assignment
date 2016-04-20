/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DAO;

import java.util.List;

/**
 *
 * @author milan
 * @param <T>
 */
public interface GenericDAO<T> {
    boolean insert(T a);
    boolean delete(int id);
    List<T> getAll();
    T getById(int id);
    List<T> search(String name);
    
    
    
    
}
