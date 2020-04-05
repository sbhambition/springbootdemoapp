package com.subsharma.springboot.demo.springbootdemoapp.service;

import com.subsharma.springboot.demo.springbootdemoapp.dao.EmployeeDao;
import com.subsharma.springboot.demo.springbootdemoapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public Employee findEmployeeById(int id) {
        return employeeDao.findEmployeeById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeDao.deleteById(id);
    }

}
