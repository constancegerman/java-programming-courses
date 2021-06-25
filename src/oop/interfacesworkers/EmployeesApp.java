package oop.interfacesworkers;

import java.util.ArrayList;

public class EmployeesApp {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Leon");
        Programmer programmer2 = new Programmer("Yury");
        Programmer programmer3 = new Programmer("Constance");

        Driver driver1 = new Driver("Igor");
        Driver driver2 = new Driver("Ilya");
        Driver driver3 = new Driver("Alexei");

        Cook cook1 = new Cook("Chris");
        Cook cook2 = new Cook("Leo");
        Cook cook3 = new Cook("Richard");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);

        for (Employee emp : employees) {
            emp.voice();
        }

        ArrayList<Programming> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);

        for (Programming prog : programmers) {
            prog.programm();
        }

        ArrayList<Driving> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        for (Driving drive : drivers) {
            drive.drive();
        }

        ArrayList<Cooking> cookers = new ArrayList<>();
        cookers.add(cook1);
        cookers.add(cook2);
        cookers.add(cook3);

        for (Cooking cook : cookers) {
            cook.cook();
        }
    }
}
