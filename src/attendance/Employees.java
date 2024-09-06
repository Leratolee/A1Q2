/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendance;

/**
 *
 * @author RC_Student_lab
 */
public class Employees {
    private String empID;
    private String empName;
    private String empSurName;
    private String empEmail;
    private String empPosition;
    private double empSalary;
    private int pin;
    private String attendance;

    public Employees() {
    }

    public Employees(String empID, String empName, String empSurName, String empEmail, String empPosition, double empSalary, int pin, String attendance) {
        this.empID = empID;
        this.empName = empName;
        this.empSurName = empSurName;
        this.empEmail = empEmail;
        this.empPosition = empPosition;
        this.empSalary = empSalary;
        this.pin = pin;
        this.attendance = attendance;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurName() {
        return empSurName;
    }

    public void setEmpSurName(String empSurName) {
        this.empSurName = empSurName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    
    
}
