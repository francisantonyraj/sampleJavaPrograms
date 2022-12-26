package collections;

import java.util.*;

class Employee {
    int employeeId;
    String employeeName;

    Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

public class HashMapping {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId(100);
        Map<String, Integer> mapping = new HashMap<>();
        Map<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put("St.Johns", employee);
        mapping.put("Ram", 100);
        mapping.put("Sam", 101);
        mapping.put("Arun", 102);
        mapping.put("Gandhi", 102);
//        mapping.put(null,103);
        mapping.put(null, null);
        mapping.put(null, null);
//        System.out.println(employeeMap.get("St.Johns").employeeId);
//        System.out.println(employeeMap.get("St.Johns").employeeName);
        System.out.println(employeeMap.get("St.Johns").getEmployeeId());
    }
}
