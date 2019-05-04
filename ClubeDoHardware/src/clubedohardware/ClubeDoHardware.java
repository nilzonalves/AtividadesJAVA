
package clubedohardware;

import java.util.Scanner;

public class ClubeDoHardware {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String string = "clubedohardware";
        
        System.out.println("Informe um numero: ");
        int num = sc.nextInt();
                
        if(string.length() == num){
            System.out.println(string);
        }else{
            System.out.println("Error");
        }

    }
    
}
