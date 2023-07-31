package src.pkg1;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    private String gender;
    private int empSal;


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    public Employee(int empId, String empName, String gender, int empSal) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", empSal=" + empSal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && empSal == employee.empSal && Objects.equals(empName, employee.empName) && Objects.equals(gender, employee.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, gender, empSal);
    }

}
