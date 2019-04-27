
import java.util.Locale;
import java.util.Scanner;


public class MatrizMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o tamanho da matriz: ");
        int tam = sc.nextInt();
        
        int matriz[][] = new int[tam][tam];
        int cont = 0;
        
        System.out.println("Preencha a matriz: ");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Main Diagonal: ");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                if(matriz[i][j] < 0){
                    cont++;
                }
                if(i == j){
                    System.out.printf("%d ", matriz[i][j]);
                }
            }
        }
        System.out.println("\nNegative numbers = " + cont);
        
        sc.close();

    }
    
}
