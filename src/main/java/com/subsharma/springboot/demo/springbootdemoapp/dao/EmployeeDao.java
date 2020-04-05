package com.subsharma.springboot.demo.springbootdemoapp.dao;

import com.subsharma.springboot.demo.springbootdemoapp.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDao implements IEmployeeDao{

    //define field for entity manager
    @Autowired
    private EntityManager entityManager;

    //constructor injection
//    @Autowired
//    public EmployeeDao(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

    @Override
    public List<Employee> findAll() {

        //get hibernate session

        Session session = entityManager.unwrap(Session.class);

        //create Query

        Query<Employee> query = session.createQuery("from com.subsharma.springboot.demo.springbootdemoapp.entity.Employee" , Employee.class);
        //execute Query

        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public Employee findEmployeeById(int id) {
        //get hibernate session

        Session session = entityManager.unwrap(Session.class);

        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void save(Employee employee){
        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(employee);
    }

    @Override
    public void deleteById(int theId) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("DELETE from com.subsharma.springboot.demo.springbootdemoapp.entity.Employee where id=:employeeId");
        query.setParameter("employeeId", theId);
        query.executeUpdate();
    }

}

