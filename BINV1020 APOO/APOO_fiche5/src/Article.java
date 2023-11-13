import java.util.Objects;

public class Article {

	private static int nombreArticlesCrees = 0;
	private static final double TAUX_TVA_DEFAUT = 21;
	private String reference;
	private String nom;
	private String description;
	private double prixHTVA;
	private double tauxTVA;

	public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) {
		setTauxTVA(tauxTVA);
		setDescription(description);
		setPrixHTVA(prixHTVA);
		this.reference = reference;
		this.nom = nom;
		nombreArticlesCrees++;
		checker(reference, nom, prixHTVA, tauxTVA);
	}

	public Article(String reference, String nom, String description,
			double prixHTVA) {
		this(reference,nom,description,prixHTVA, TAUX_TVA_DEFAUT);
		checker(reference, nom, prixHTVA, TAUX_TVA_DEFAUT);
	}

	public static int getNombreArticlesCrees() {
		return nombreArticlesCrees;
	}
	public String getReference() {
		return reference;
	}

	public String getNom() {
		return nom;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixHTVA() {
		return prixHTVA;
	}
	
	public void setPrixHTVA(double prixHTVA) {
		//if(prixHTVA < 0) throw new IllegalArgumentException("Prix HTVA doit être positif");
		this.prixHTVA = prixHTVA;
	}

	public double getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(double tauxTVA) {
		//if (tauxTVA < 0 || tauxTVA > 100) throw new IllegalArgumentException("Taux TVA doit être compris entre 0 et 100");
		this.tauxTVA = tauxTVA;
	}


	public double calculerPrixTVAComprise() {
		return prixHTVA * (1+ tauxTVA/100);
	}

	public double calculerPrixTVAComprise(int reduction) {
		return calculerPrixTVAComprise() * (1-reduction/100.0);
	}

	@Override
	public String toString() {
		return "Référence : " + reference + "\nNom : " + nom + " (prix HTVA : " + prixHTVA + ", taux de TVA : " + tauxTVA +"%)";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Article article = (Article) o;
		return reference.equals(article.reference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reference);
	}

	public void checker(String reference, String nom, double prixHTVA, double tauxTVA) {
		if (reference == null || reference.isEmpty()) {
			throw new IllegalArgumentException("La référence ne peut pas être null ou vide.");
		}

		if (nom == null || nom.isEmpty()) {
			throw new IllegalArgumentException("Le nom ne peut pas être null ou vide.");
		}

		if (prixHTVA < 0) {
			throw new IllegalArgumentException("Le prix HTVA ne peut pas être négatif.");
		}

		if (tauxTVA < 0 || tauxTVA > 100) {
			throw new IllegalArgumentException("Le taux de TVA doit être compris entre 0 et 100.");
		}
	}
}
