package com.p1.DAO;

import com.p1.Model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;

@Repository
public class DeptDAO {

    @Autowired
    private EntityManager entityManager;

    public List<Dept> getAllDepts() {
        return entityManager.createQuery("SELECT d FROM Dept d", Dept.class).getResultList();
    }

    @Transactional
    public Dept createDept(Dept dept) {
        entityManager.persist(dept);
        return dept;
    }

    // Add other CRUD operations as needed
}
