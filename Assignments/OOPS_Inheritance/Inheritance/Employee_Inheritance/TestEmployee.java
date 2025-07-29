package Assignments.OOPS_Inheritance.Inheritance.Employee_Inheritance;

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Meghana", 50000, 2026, "1212");
        
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Year Started: " + emp.getYear());
        System.out.println("Insurance Number: " + emp.getInsuranceNumber());
    }
}
