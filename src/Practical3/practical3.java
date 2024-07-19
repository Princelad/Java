package Practical3;

import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private double Salary;

    public Employee() {
        firstName = "";
        lastName = "";
        Salary = 0.0;
    }

    public void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name : ");
        firstName = scan.nextLine();
        System.out.print("Enter the last name : ");
        lastName = scan.nextLine();
        System.out.print("Enter the employee salary : ");
        Salary = scan.nextDouble();
        if (Salary < 0.0) {
            Salary = 0.0;
        }
    }

    public void putData() {
        System.out.println("Employee details : ");
        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);
        System.out.println("Salary : " + Salary);
    }

    public void salaryRise() {
        Salary += (0.1*Salary); 
    }
}

public class practical3 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.getData();

        e.putData();

        e.salaryRise();

        e.putData();
    }
}
