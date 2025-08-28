//Déclaration de la classe
public class jour14 {
    //Attributs
    public String livre;
    public String auteur;
    //Constructeur
    public jour14(String livre, String auteur){
        this.livre = livre;
        this.auteur = auteur;
    }
    //Méthode pour afficher les informations du livre
    public void afficherInfo(){
        System.out.println("le livre est: " + livre + " et l'auteur est: " + auteur);
    }
    
    public static void main(String[] args) {
        //Instance de la classe (création de l'objet)
        jour14 livre = new jour14("Think and Grow Rich", "Napoleon HILL");
        //Appel de la méthode pour afficher les informations
        livre.afficherInfo();
    }
}