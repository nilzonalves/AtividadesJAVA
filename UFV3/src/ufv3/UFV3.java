
package ufv3;

import entities.Data;
import java.util.Scanner;

public class UFV3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int dia, mes, ano;
        Data data = new Data();
        
        System.out.println("Informe o dia, mes e ano: ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();
        
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);
        
        System.out.println(data.toString());
    }
    
}
