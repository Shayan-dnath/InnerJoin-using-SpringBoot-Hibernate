package com.p1.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmpID")
    private Long empID;

    @Column(name = "ename")
    private String ename;

    @Column(name = "esal")
    private Double esal;

    @Column(name = "edoj")
    private Date edoj;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "edeptID")
    private Dept dept;

    public Employee(Long empID, String ename, Double esal, Date edoj, Dept dept) {
        this.empID = empID;
        this.ename = ename;
        this.esal = esal;
        this.edoj = edoj;
        this.dept = dept;
    }

    public Employee() {
    }

    public Long getEmpID() {
        return empID;
    }

    public void setEmpID(Long empID) {
        this.empID = empID;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getEsal() {
        return esal;
    }

    public void setEsal(Double esal) {
        this.esal = esal;
    }

    public Date getEdoj() {
        return edoj;
    }

    public void setEdoj(Date edoj) {
        this.edoj = edoj;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
