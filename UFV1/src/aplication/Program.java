package aplication;
import entities.Casa;
import entities.Porta;

public class Program {

    public static void main(String[] args) {
        
        System.out.println("-------PORTA-------");
        
        Porta porta = new Porta();
        Casa casa = new Casa();
        
        porta.abre();
        porta.fecha();
        porta.abre();
        
        porta.pinta("vermelho");
        porta.pinta("azul");
        
        porta.setAltura(123);
        porta.setLargura(312);
        
        System.out.println(porta.toString());
        
        
        System.out.println("-------CASA-------");
        
        casa.pinta("Vermelho");
        casa.abre();
        casa.fecha();

        System.out.println(casa.toString());

    }
    
}
