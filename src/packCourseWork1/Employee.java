package packCourseWork1;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
        private String fullName;
        private int department;
        private double salary;
        public static int count;
        private final int id;

    private static int incrementId() {
        return count++;
    }

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id=incrementId();
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format ("%nСотрудник %s / Отдел № %s / ЗП %.2f руб / ID %s",fullName, department, salary, id);
    }

}