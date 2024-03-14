package com.p1.Service;
import com.p1.DAO.EmployeeDAO;
import com.p1.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public Employee createEmployee(Employee employee) {
        return employeeDAO.createEmployee(employee);
    }

    public List<Object[]> getEmployeeDetailsWithDept() {
        return employeeDAO.getEmployeeDetailsWithDept();
    }

    public Object[] getEmployeeDetailsWithDeptById(Long empId) {
        return employeeDAO.getEmployeeDetailsWithDeptById(empId);
    }
}
