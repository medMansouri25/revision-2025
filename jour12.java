//Max dans un tableau
//Imporatation bibliothéques
import java.util.*;

//Classe qui gére  le max d'un tableau
public class jour12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Demande de la taille du tableau
        System.out.println("entrer la taille du tableau");
        int N = sc.nextInt();
        if (N <= 0){
            System.out.println("erreur");
            return;
        }


        //Demande d'entrer les nombre de la liste
        System.out.println("Merci d'entrer les nombres de liste");

        //Création du tableau avec la taille N
        int[] liste = new int[N];
        //Remplissage du tableau
        for(int i =0; i<N; i++){
            liste[i] = sc.nextInt();
        }
        //Afficher le tableau
        System.out.println("le tableau est: " + Arrays.toString(liste));


        //Initialisation du max
        int max = liste[0];
        //parcourir la liste 
        for (int i=0; i<=N; i++){
            if (i > max){
                max = i;
            }
        }
        //Afficher le max
        System.out.println("le max est: " + max);
        sc.close();


    }
    
}
