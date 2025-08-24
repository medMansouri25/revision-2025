//Somme de deux nombre
//importation
import java.util.*;

public class jour10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pour lire un nombre à l'entrée de clavier
        System.out.println("entrer le premier nombre ");
        int a =sc.nextInt();
        System.out.println("entrer le deuxieme nombre");
        int b =sc.nextInt();
        //la somme des deux nombre est stocker variable somme
        int somme=a+b;
        System.out.println("La somme de " + a + " et " + b + " est : " + somme);
        sc.close();
    }
}

