import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;
    double hra;
    double da;
    double deduction;
    double netSalary;

 
    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void calculateSalary() {
        hra = basicSalary * 0.20;      // 20% HRA
        da = basicSalary * 0.10;       // 10% DA
        deduction = basicSalary * 0.05; // 5% Deduction

        netSalary = basicSalary + hra + da - deduction;
    }

    void displayDetails() {
        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("HRA (20%)        : " + hra);
        System.out.println("DA (10%)         : " + da);
        System.out.println("Deduction (5%)   : " + deduction);
        System.out.println("Net Salary       : " + netSalary);
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.getDetails();
        emp.calculateSalary();
        emp.displayDetails();
    }
}
