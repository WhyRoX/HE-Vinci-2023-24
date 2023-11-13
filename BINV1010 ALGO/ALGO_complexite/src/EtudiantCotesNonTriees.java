public class EtudiantCotesNonTriees {
    private double[] tableCotes;  // table non triee - les cotes sont comprises entre 0 et 20
    private int matricule;

    /**
     * methode qui calcule la moyenne des cotes de l'etudiant
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return moyenne des cotes de l'etudiant
     */
    public double moyenne() {
        double somme = 0;
        for (double cote : tableCotes) {
            somme += cote;
        }
        return somme / tableCotes.length;
    }

    /**
     * methode qui recherche la plus petite cote de l'etudiant
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return la plus petite cote de l'etudiant
     */
    public double min(){
        double coteMin = Double.MAX_VALUE;
        for (double cote : tableCotes) {
            if (cote < coteMin) {
                coteMin = cote;
            }
        }
        return coteMin;
    }

    /**
     * methode qui recherche la cote la plus elevee de l'etudiant
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return la cote la plus elevee de l'etudiant
     */
    public double max(){
        double coteMax = 0;
        for (double cote : tableCotes) {
            if (cote > coteMax) {
                coteMax = cote;
            }
        }
        return coteMax;
    }

    /**
     * methode qui calcule le nombre d'echecs de l'etudiant
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return nombre d'echecs (cote < 10) de l'etudiant
     */
    public int nombreEchecs(){
        int nbrEchecs = 0;
        for (double cote : tableCotes) {
            if (cote < 10) {
                nbrEchecs++;
            }
        }
       return nbrEchecs;
    }

    /**
     * methode qui verifie si l'etudiant n'a pas d'echec
     * precondition (a ne pas verifier) : la table contient au moins 1 cote
     * @return true si l'eudiant n'a pas pas d'echec, false sinon
     */
    public boolean aucunEchec(){
        for (double cote : tableCotes) {
            if (cote < 10) {
                return false;
            }
        }
        return true;
    }



    //A NE PAS MODIFIER
    //VA SERVIR POUR LES TESTS
    public EtudiantCotesNonTriees(int matricule, double[] tableARecopier){
        if(tableARecopier.length==0)
            throw new IllegalArgumentException();
        this.matricule = matricule;
        this.tableCotes = new double[tableARecopier.length];
        tableCotes[0] = tableARecopier[0];
        for(int i = 1; i < tableARecopier.length; i++) {
            tableCotes[i] = tableARecopier[i];
        }
    }


    public String toString(){
        String aRenvoyer = "\n matricule : " + this.matricule +"\n cotes : ";
        for(int i = 0; i < tableCotes.length; i++)
            aRenvoyer = aRenvoyer + "  " + tableCotes[i];
        return aRenvoyer;
    }
}
