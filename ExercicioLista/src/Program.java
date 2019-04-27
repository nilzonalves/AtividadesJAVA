import entities.Employees;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employees> list = new ArrayList<>();
        
        //PART 1: Reading DATA;
        
        System.out.println("How mano employess will be registered ?");
        int qtd = sc.nextInt();     
        
        for(int i = 0; i<qtd; i++){
            System.out.printf("Employee #%d\n",i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: \n");
            String name = sc.nextLine();
            System.out.print("Salary: \n");
            Double salary = sc.nextDouble();
          
            //depois de ler os dados, ADICIONA NA LISTA, chamando o contrutor.
            list.add(new Employees(id, name, salary));
            
        }
        
        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
        
        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This ID does not exist!");
        }else{
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        
        //PART 3: LISTING EMPLOYEES


        System.out.println();
        System.out.println("List of Employees ");
        for(Employees obj : list){
            System.out.println(obj);
        }
        
        sc.close();
        
    }
    
}
