package aplications;

import entities.Conta;
import java.util.Locale;
import java.util.Scanner;


public class ExercicioMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner input = new Scanner(System.in);
        
        Conta conta = new Conta();
        
        System.out.print("Enter account number: ");
        int number = input.nextInt();
        
        System.out.print("Enter accoount holder: ");
        input.nextLine();
        String name = input.nextLine();
        
        System.out.print("Is there na initial deposit (1 = y/2 = n) ? ");
        char opc = input.next().charAt(0);
                
        if(opc == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();
            conta = new Conta(number, name, initialDeposit);
        }else if(opc == 'n'){
            conta = new Conta(number, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = input.nextDouble();
        conta.depositar(depositValue);
        
        System.out.println("Updated account data: ");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Enter a withdorwn value: ");
        double withdrawValue = input.nextDouble();
        conta.sacar(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(conta);        
        
        input.close();
        
    }
    
}
