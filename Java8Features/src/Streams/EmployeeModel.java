package Streams;

import java.util.List;
import java.util.Objects;

public class EmployeeModel {

    private int empId;
    private String empName;
    private String empRole;
    private String empGender;
    private int empSalary;
    private List<String> phoneNumbers;


    public EmployeeModel() {
    }

    public EmployeeModel(int empId, String empName, String empRole, String empGender, int empSalary, List<String> phoneNumbers) {
        this.empId = empId;
        this.empName = empName;
        this.empRole = empRole;
        this.empGender = empGender;
        this.empSalary = empSalary;
        this.phoneNumbers = phoneNumbers;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return this.empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getEmpGender() {
        return this.empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public int getEmpSalary() {
        return this.empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public EmployeeModel empId(int empId) {
        setEmpId(empId);
        return this;
    }

    public EmployeeModel empName(String empName) {
        setEmpName(empName);
        return this;
    }

    public EmployeeModel empRole(String empRole) {
        setEmpRole(empRole);
        return this;
    }

    public EmployeeModel empGender(String empGender) {
        setEmpGender(empGender);
        return this;
    }

    public EmployeeModel empSalary(int empSalary) {
        setEmpSalary(empSalary);
        return this;
    }

    public EmployeeModel phoneNumbers(List<String> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeModel)) {
            return false;
        }
        EmployeeModel employeeModel = (EmployeeModel) o;
        return empId == employeeModel.empId && Objects.equals(empName, employeeModel.empName) && Objects.equals(empRole, employeeModel.empRole) && Objects.equals(empGender, employeeModel.empGender) && empSalary == employeeModel.empSalary && Objects.equals(phoneNumbers, employeeModel.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empRole, empGender, empSalary, phoneNumbers);
    }

    @Override
    public String toString() {
        return "{" +
            " empId='" + getEmpId() + "'" +
            ", empName='" + getEmpName() + "'" +
            ", empRole='" + getEmpRole() + "'" +
            ", empGender='" + getEmpGender() + "'" +
            ", empSalary='" + getEmpSalary() + "'" +
            ", phoneNumbers='" + getPhoneNumbers() + "'" +
            "}";
    }

}
