package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {


    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.print("Enter Worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        
        System.out.println("How many contracts to this worker ?");
        int n = sc.nextInt();
        
        for(int i = 0; i<n; i++){
            System.out.println("Enter contract #" + i + " data");
            System.out.print("Date: (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value por houe: ");
            double valuePerhour = sc.nextDouble();
            System.out.print("Duration (hour): ");
            int hour = sc.nextInt();
            
            HourContract contract = new HourContract(contractDate, valuePerhour, hour);
            worker.addContract(contract);
        }
        
        System.out.println();
        //pegando o mes e ano, RECORTANDO A STRING (essa é outra forma de se pegar data)
        System.out.print("Enter month and year to calculate income: (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));       
        
        sc.close();
    }
    
}
