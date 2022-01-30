package com.sjsuhil09;

import com.sjsuhil09.model.Employee;
import com.sjsuhil09.model.EmployeeType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class JpaStarterMain {
    public static void main(String[] args) {
        Employee employee =new Employee();
        employee.setName("Varun");
        employee.setDob(new Date());
        employee.setSsn("123");
        employee.setEmployeeType(EmployeeType.FULL_TIME);

        Employee employee1 =new Employee();
        employee1.setName("Vishal");
        employee1.setDob(new Date());
        employee1.setSsn("12345");
        employee1.setEmployeeType(EmployeeType.CONTRACTOR);

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("myApp");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(employee);
        entityManager.persist(employee1);
        entityTransaction.commit();


    }
}
