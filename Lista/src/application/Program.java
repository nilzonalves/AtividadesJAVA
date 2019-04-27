package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        //adicionando elementos na lista;
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //adicionando elemento na lista em um índice específico;
        list.add(2, "Marco");
        
        //exibindo tamanho da lista;
        System.out.println("Tamano da lita: " + list.size());
        
        //exibindo elementos da lista;
        System.out.println("LISTA INICIAL: ");
        for(String x : list){
            System.out.println(x);
        }
        
        //removendo elemento da lista;
        list.remove("Neto"); // removendo por comparação de string
        list.remove(1);     // ou removendo pelo ÍNDICE;
        
        //removendo por predicado;
        // Remove todos os elementos, cujo o INDICE charAt(0) seja IGUAL a 'A';
        list.removeIf(x -> x.charAt(0) == 'M'); // expressão Lambda;
        System.out.println("-------------------");
        System.out.println("LISTA APÓS REMOÇÃO DE ELEMENTOS QUE ECOMEÇAM COM M");
         for(String x : list){
            System.out.println(x);
        }
         
        System.out.println("-------------------");         
         //encontrar posição do elemento;         
         System.out.println("POSIÇÂO DO ELEMENTO USANDO: Index of Bob: " + list.indexOf("Anna"));
         
         System.out.println("-------------------");
         //deixar na lista SOMENTE OS NOMES QUE COMEÇAM com 'M'
         //Criar uma nova lista, filtrar, e armazenar na nova lista ja filtrado.
         List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
         // *testar != no mesmo FILTRO do FOR EACH usado acima;
         System.out.println("LISTA APENAS COM NOMES COMEÇADOS COM A");
        for(String x : result){
            System.out.println(x);
        }        
        
        //Exibindo o primeiro elemento que ATENDA O PREDICADO
        System.out.println("-------------------");
        System.out.println("EXIBINDO O PRIMEIRO ELEMENTO DA LISTA QUE ATENDE O PREDICADO");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
                 
    }
    
}
