
import java.util.Scanner;

class Member {
    private String name;
    private int age;
    private long contact;
    private String address;
    private int salary;

    public Member(String name, int age, long contact, String address, int salary) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, long contact, String address, int salary, String specialization) {
        super(name, age, contact, address, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.print("Name : " + super.getName());
        System.out.print("Age : " + super.getAge());
        System.out.print("Contact number : " + super.getContact());
        System.out.print("Address : " + super.getAddress());
        System.out.print("Salary : " + super.getSalary());
        System.out.print("Specialization : " + getSpecialization());
    }
}

class Manager extends Member {
    private String department;
    
    public Manager(String name, int age, long contact, String address, int salary, String department) {
        super(name, age, contact, address, salary);
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayDetails() {
        System.out.print("Name : " + super.getName());
        System.out.print("Age : " + super.getAge());
        System.out.print("Contact number : " + super.getContact());
        System.out.print("Address : " + super.getAddress());
        System.out.print("Salary : " + super.getSalary());
        System.out.print("Department : " + getDepartment());
    }
}

public class Prac2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            Employee employee = new Employee(null, 0, 0, null, 0, null);
            Manager manager = new Manager(null, 0, 0, null, 0, null);

            
            
            scan.close();
        }
    }
}
