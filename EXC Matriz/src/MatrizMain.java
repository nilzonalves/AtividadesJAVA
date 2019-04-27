import java.util.Locale;
import java.util.Scanner;


public class MatrizMain {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);;
        Scanner sc = new Scanner(System.in);
        int n, m;
        
        System.out.println("Informe o tamaho da matriz: Linha e Coluna");
        n = sc.nextInt();
        m = sc.nextInt();
        
        int matriz[][] = new int[n][m];
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.printf("%d, %d:", i+1, j+1);
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        for(int i = 0; i < n; i++){            
            for(int j = 0; j < m; j++){
                System.out.print(matriz[i][j]);                
            }
            System.out.print("\n");
            
        }
        
        int num;
        System.out.println("Informe um numero para localizar: ");
        num = sc.nextInt();
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matriz[i][j] == num){
                    System.out.printf("Position %d,%d: \n", i, j);
                  
                    if(j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    
                    if(i > 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    
                    if(j < matriz[i].length-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                        
                    if(i < matriz.length-1){
                        System.out.println("Down: " + matriz[i+1][j]);    
                    }
                }
            }
        }
        
    }
    
}
