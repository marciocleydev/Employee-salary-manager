package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Employee employee;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();
        employee = new Employee(name, grossSalary, tax);

        System.out.println("\nEmployee: " + employee);

        System.out.print("\nwhich percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println(" Updated data: " + employee);


        sc.close();

    }
}