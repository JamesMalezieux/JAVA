package partie2;

public class Ville {
private String nomVille, nomPays;
private int nombreHabitants;
public Ville() {
	super();
}
public Ville(String nomVille, String nomPays, int nombreHabitants) {
	super();
	this.nomVille = nomVille;
	this.nomPays = nomPays;
	this.nombreHabitants = nombreHabitants;
}
public String getNomVille() {
	return nomVille;
}
public void setNomVille(String nomVille) {
	this.nomVille = nomVille;
}
public String getNomPays() {
	return nomPays;
}
public void setNomPays(String nomPays) {
	this.nomPays = nomPays;
}
public int getNombreHabitants() {
	return nombreHabitants;
}
public void setNombreHabitants(int nombreHabitants) {
	this.nombreHabitants = nombreHabitants;
}


}
