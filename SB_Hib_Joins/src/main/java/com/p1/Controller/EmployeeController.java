package com.p1.Controller;
import com.p1.DAO.EmployeeDAO;

import com.p1.Model.Employee;
import com.p1.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/allemployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/registeremployee")
    public ResponseEntity<String > createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        String rp="Employee Registered Successfully";
        return new ResponseEntity<String>(rp, HttpStatus.OK);

    }
    @GetMapping("/details")
    public List<Object[]> getEmployeeDetailsWithDept() {
        return employeeService.getEmployeeDetailsWithDept();
    }
    @GetMapping("/{empId}")
    public Object[] getEmployeeDetailsWithDeptById(@PathVariable Long empId) {
        return employeeService.getEmployeeDetailsWithDeptById(empId);
    }
}