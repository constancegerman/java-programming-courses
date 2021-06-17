package oop.employee;

public class Employee {
    String name;
    String speciality;
    int salary;

    Employee(String n, String s, int b) {
        this.name = n;
        this.speciality = s;
        this.salary = b;
    }

    public String info(int months) {
        int totalBenefit = salary * months;
        return "Employee: " + name + ", speciality: " + speciality + ", has " + salary + "$ per month and " + totalBenefit + "$ per " + months + " months.";
    }
}
