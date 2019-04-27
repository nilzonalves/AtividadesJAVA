
import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> list = new ArrayList<>();
        
        System.out.println("Informe o numero de funcionários: ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            
            System.out.println("Employee #"+i+" data: ");
            System.out.println("Terceirizado ? (y/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hour: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            
            if(ch == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(additionalCharge, name, hour, valuePerHour);
                list.add(emp);
            }else{
                Employee emp = new Employee(name, hour, valuePerHour);
                list.add(emp);
            }
            
        }
        
        for(Employee emp : list)
            System.out.println(emp.getName() + " " +String.format("%.2f", emp.payment()));
    }
    
}
