import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId;
        String empName;
        double salary, grossSalary, netSalary;

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        salary = sc.nextDouble();

        grossSalary = salary + 5000;   
        netSalary = grossSalary - 2000; 

        System.out.println("\n----- Payroll Details -----");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Net Salary    : " + netSalary);

        sc.close();
    }
}