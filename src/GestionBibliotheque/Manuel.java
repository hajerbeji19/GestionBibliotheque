package GestionBibliotheque;

class Manuel extends Document {
	private int NiveauScolaire;
	public Manuel(int num, String titre,int NiveauScolaire) {
		super(num,titre);
		this.NiveauScolaire=NiveauScolaire;
	}
	@Override
	public String toString() {
		return "Livres[numero: "+getNum()+", titre: "+getTitre()
		+" ,NiveauScolaire: "+NiveauScolaire;
	}
}
