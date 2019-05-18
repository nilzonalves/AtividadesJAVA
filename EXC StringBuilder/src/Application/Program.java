package Application;

import entitites.Comment;
import entitites.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {


    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("daleeeeeeeeeeeeee");
        Comment c2 = new Comment("biri biri");
        
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
                "Traveling to new Zealand", 
                "Vou vizitar essa desgraça", 12);
        
        p1.addComment(c1);
        p1.addComment(c2);
        
        System.out.println(p1);
        
        Comment c3 = new Comment("Chaaaaaama no Reskein");
        Comment c4 = new Comment("Ai a humildade ta la no teto");
        
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good Night Guys", "See you Tomorrow", 5);
        
        p2.addComment(c3);
        p2.addComment(c4);
        
        System.out.println(p2);
        
    }
    
}
