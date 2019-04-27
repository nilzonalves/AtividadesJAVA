
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class program {


    public static void main(String[] args) {
        
        Account acc = new Account(1001, "Alex", 0.0);
        
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
     
        //UPCASTING = É eu pegar um obj da subclasse, e atribui-lo a uma variavel da superclasse;
        
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
        
        //downcasting = é converter um obj da superclasse para a subclasse.
        
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        
        //erro
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        
        System.out.println("------SOBREPOSIÇÃO/PALAVRA SUPER/OVERRIDE------");
        Account acc5 = new Account(1010, "Alex", 1000.0);
        acc5.withdrown(200.0);
        System.out.println(acc5.getBalance());
        
        Account acc6 = new SavingsAccount(1009, "Maria", 1000.0, 0.01);
        acc6.withdrown(200);
        System.out.println(acc6.getBalance());
        
        Account acc7 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc7.withdrown(200);
        System.out.println(acc7.getBalance());
    }
    
}
