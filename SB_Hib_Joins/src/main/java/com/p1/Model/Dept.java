package com.p1.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@Table(name = "Dept")
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deptID")
    private Long deptID;

    @Column(name = "dname")
    private String dname;

    @OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Employee> employees;

    public Dept(Long deptID, String dname, List<Employee> employees) {
        this.deptID = deptID;
        this.dname = dname;
        this.employees = employees;
    }

    public Dept(Long deptID) {
        this.deptID = deptID;
    }

    public Dept() {
    }

    public Long getDeptID() {
        return deptID;
    }

    public void setDeptID(Long deptID) {
        this.deptID = deptID;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // Getters and setters
    // Constructors
    // Other methods
}