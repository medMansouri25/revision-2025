public class jour15 {
    private String nom;
    Double[] notes;
    private static int nombreEtudiants = 0;
    public jour15(String nom, Double[] notes) {
        this.nom = nom;
        this.notes = notes;
        nombreEtudiants++;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Double[] getNotes() {
        return notes;
    }
    public void setNotes(Double[] notes) {
        this.notes = notes;
    }
    public double calculerMoyenne() {
        double somme = 0;
        // Calcul de la somme des notes
        for (double note : notes) {
            somme += note;
        }
            // Calcul de la moyenne
        return somme / notes.length;
    }
    public static void main(String[] args) {
        Double[] notes1 = {15.0, 18.5, 12.0};
        jour15 etudiant1 = new jour15("Alice", notes1);
        System.out.println("Nom: " + etudiant1.getNom());
        System.out.println("Moyenne: " + etudiant1.calculerMoyenne());
        
        Double[] notes2 = {14.0, 16.5, 13.0, 19.0};
        jour15 etudiant2 = new jour15("Bob", notes2);
        System.out.println("Nom: " + etudiant2.getNom());
        System.out.println("Moyenne: " + etudiant2.calculerMoyenne());
        
        System.out.println("Nombre total d'etudiants: " + nombreEtudiants);
    }  
}
