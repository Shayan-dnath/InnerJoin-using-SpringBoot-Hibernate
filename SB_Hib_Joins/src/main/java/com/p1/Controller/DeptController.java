package com.p1.Controller;
import com.p1.DAO.DeptDAO;
import com.p1.Model.Dept;
import com.p1.Service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/")
    public List<Dept> getAllDepts() {
        return deptService.getAllDepts();
    }

    @PostMapping("/")
    public Dept createDept(@RequestBody Dept dept) {
        return deptService.createDept(dept);
    }

    // Add other CRUD operations as needed
}

