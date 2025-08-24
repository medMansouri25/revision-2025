//importation bibliothéque 
import java.util.*;

//Création de classe
public class jour11 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("entrer le nombre");
        int a =sc.nextInt();
        System.out.println("--La table est la suivante--");
        for(int i =1; i<= 10; i++){
             System.out.println(a + " x " + i + " = " + (a*i));
        }
        sc.close();
    }
    
}
