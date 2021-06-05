/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author iftekher
 */
@Entity
@Table(name="tbl_employee")
public class Employee implements Serializable {
    @Id
    private int id;
    private String name;
    private String sex;
    private int companyNo;
    private String branchId;
    private String departmentCode;
    private String designation;
    private String confirmationDate;
    private String joiningDate;
    @Embedded
    private Salary salaryInfo;
    @Embedded
    private PersonalInformation personalInfo;
    @Embedded
    private Address address;

    public Employee() {
    }

    public Employee(int id, String name, String sex, int companyNo, String branchId, String departmentCode, String designation, String confirmationDate, String JoiningDate, Salary salaryInfo, PersonalInformation personalInfo, Address address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.companyNo = companyNo;
        this.branchId = branchId;
        this.departmentCode = departmentCode;
        this.designation = designation;
        this.confirmationDate = confirmationDate;
        this.joiningDate = JoiningDate;
        this.salaryInfo = salaryInfo;
        this.personalInfo = personalInfo;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getCompanyNo() {
        return companyNo;
    }

    public String getBranchId() {
        return branchId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDesignation() {
        return designation;
    }

    public String getConfirmationDate() {
        return confirmationDate;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public Salary getSalaryInfo() {
        return salaryInfo;
    }

    public PersonalInformation getPersonalInfo() {
        return personalInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCompanyNo(int companyNo) {
        this.companyNo = companyNo;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setConfirmationDate(String confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public void setJoiningDate(String JoiningDate) {
        this.joiningDate = JoiningDate;
    }

    public void setSalaryInfo(Salary salaryInfo) {
        this.salaryInfo = salaryInfo;
    }

    public void setPersonalInfo(PersonalInformation personalInfo) {
        this.personalInfo = personalInfo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", sex=" + sex + ", companyNo=" + companyNo + ", branchId=" + branchId + ", departmentCode=" + departmentCode + ", designation=" + designation + ", confirmationDate=" + confirmationDate + ", JoiningDate=" + joiningDate + ", salaryInfo=" + salaryInfo + ", personalInfo=" + personalInfo + ", address=" + address + '}';
    }
    
    
}
