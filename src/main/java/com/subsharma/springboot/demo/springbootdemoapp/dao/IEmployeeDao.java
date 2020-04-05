package com.subsharma.springboot.demo.springbootdemoapp.dao;

import com.subsharma.springboot.demo.springbootdemoapp.entity.Employee;

import java.util.List;

public interface IEmployeeDao {

     List<Employee> findAll();

     Employee findEmployeeById(int id);

    void save(Employee employee);

    void deleteById(int id);

}
