
public class CercleDansLePlan {
	private double rayon;
	private Point centre;
	
	public CercleDansLePlan(double rayon, Point centre) {
		this.rayon = rayon;
		this.centre = centre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) { this.centre = centre; }
	
	public String toString() {
		return "Cercle de rayon : " + rayon + " de centre " + centre;
	}
	// Ajoutez dans la classe CercleDansLePlan deux constructeurs. Le premier prend en
	//param�tre uniquement le centre et cr�e un cercle de rayon 1 ayant ce centre. Le deuxi�me
	//ne prend rien en param�tre et cr�e un cercle de rayon 1 centr� au point (0,0). Il faut que ces
	//constructeurs invoquent un autre constructeur.

}
