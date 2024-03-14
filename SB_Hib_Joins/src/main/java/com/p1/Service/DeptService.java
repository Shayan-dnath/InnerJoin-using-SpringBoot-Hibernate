package com.p1.Service;
import com.p1.DAO.DeptDAO;
import com.p1.Model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptDAO deptDAO;

    public List<Dept> getAllDepts() {
        return deptDAO.getAllDepts();
    }

    public Dept createDept(Dept dept) {
        return deptDAO.createDept(dept);
    }

    // Add other CRUD operations as needed
}
