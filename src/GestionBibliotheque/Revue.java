package GestionBibliotheque;

class Revue extends Document {
	private int mois;
	private int annee;
	public Revue(int num, String titre, int mois,int annee) {
		super(num,titre);
		this.mois=mois;
		this.annee=annee;
	}
	@Override
	public String toString() {
		return "Livres[numero: "+getNum()+", titre: "+getTitre()+
				" ,mois: "+mois+" ,année: "+annee;
	}
}
