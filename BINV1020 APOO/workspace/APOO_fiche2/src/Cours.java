public class Cours {
    private String intitule;
    private String niveau;
    private int nbInscrits;
    private Professeur professeur;


    public Cours(String intitule, String niveau, Professeur professeur) {
        this.intitule = intitule;
        this.niveau = niveau;
        this.nbInscrits = 0;
        this.professeur = professeur;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getNiveau() {
        return niveau;
    }

    public int getNbInscrits() {
        return nbInscrits;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public void inscrireEleve() {
        nbInscrits +=1;
    }

    public void desinscrireEleve() {
        nbInscrits -= 1;

    }

    @Override
    public String toString() {
        return intitule + "\nCours de niveau " + niveau + " donn� par " + professeur.getPrenom() + " " +
                professeur.getNom() + "\nNombre d'�l�ves inscrits : " + nbInscrits;
    }
}
