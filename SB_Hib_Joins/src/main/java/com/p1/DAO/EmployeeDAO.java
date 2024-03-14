package com.p1.DAO;

import com.p1.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    }

    public List<Object[]> getEmployeeDetailsWithDept() {
        return entityManager.createQuery("SELECT e.empID, e.ename, e.esal, e.edoj, d.dname FROM Employee e JOIN e.dept d", Object[].class).getResultList();
    }

    @Transactional
    public Employee createEmployee(Employee employee) {
        entityManager.persist(employee);
        return employee;
    }

    public Object[] getEmployeeDetailsWithDeptById(Long empId) {
        return (Object[]) entityManager.createQuery("SELECT e.empID, e.ename, e.esal, e.edoj, d.dname " +
                        "FROM Employee e JOIN e.dept d WHERE e.empID = :empId")
                .setParameter("empId", empId)
                .getSingleResult();
    }
}
