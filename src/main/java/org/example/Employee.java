package org.example;

import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private boolean isPunchedIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.isPunchedIn = false;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getRegularPay() {
        return getRegularHours() * payRate;
    }

    public double getOvertimePay() {
        return getOvertimeHours() * payRate * 1.5;
    }

    public double getTotalPay() {
        return getRegularPay() + getOvertimePay();
    }

    private double punchInTime;

    public void punchIn(Double time) {
        if (!isPunchedIn) {
            if (time == null) {
                LocalDateTime now = LocalDateTime.now();
                punchInTime = now.getHour() + now.getMinute() / 60.0;
                System.out.println(name + " punched in at " + now.getHour() + ":" + now.getMinute());
            } else {
                punchInTime = time;
                System.out.println(name + " punched in manually at time: " + time);
            }
            isPunchedIn = true;
        } else {
            System.out.println(name + " is already punched in.");
        }
    }

    public void punchOut(Double time) {
        if (isPunchedIn) {
            double punchOutTime;
            if (time == null) {
                LocalDateTime now = LocalDateTime.now();
                punchOutTime = now.getHour() + now.getMinute() / 60.0;
            } else {
                punchOutTime = time;
            }

            double worked = punchOutTime - punchInTime;
            if (worked > 0) {
                hoursWorked += worked;
                System.out.println(name + " worked: " + worked + " hours");
            }
            isPunchedIn = false;
        } else {
            System.out.println(name + " hasn't punched in yet.");
        }
    }

}
