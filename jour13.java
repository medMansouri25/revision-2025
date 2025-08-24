//importation bibliothéque
import java.util.*;
//Création de classe
public class jour13 {
    public static long factoriel(int n) {
        if (n == 0) {
            return 1;
        } 
        else {
            return n * factoriel(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le nombre");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("erreur");
        } 
        else {
            long result = factoriel(a);
            System.out.println("le factoriel de " + a + " est: " + result);
        }
        sc.close();
    }
}
