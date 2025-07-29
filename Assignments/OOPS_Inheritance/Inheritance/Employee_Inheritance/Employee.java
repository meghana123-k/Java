package Assignments.OOPS_Inheritance.Inheritance.Employee_Inheritance;

public class Employee extends Person {
    double salary;
    int year;
    String insur_num;
    public Employee(String name, double salary, int year, String insur_name) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.insur_num = insur_name;
    }
    double getSalary() {
        return salary;
    }
    int getYear() {
        return year;
    }
    String getInsuranceNumber() {
        return insur_num;
    }
    void setSalary(double salary) {
        this.salary = salary;
    }
    void setYear(int year) {
        this.year = year;
    }
    void setInsuranceNumber(String insur_name) {
        this.insur_num = insur_name;
    }
}
