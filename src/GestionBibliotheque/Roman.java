package GestionBibliotheque;

class Roman extends Livre {
	private int prixLitteraire;
	public Roman(int num, String titre ,String auteur,int nbPages,int prixLitteraire) {
		super(num,titre,auteur,nbPages);
		this.prixLitteraire=prixLitteraire;
	}
	
	@Override
	public String toString() {
		return "Livres[numero: "+getNum()+", titre: "+getTitre()
		+" ,auteur: "+getAuteur()+" nombre pages:"+getNbPages()
		+" ,prixLitteraire: "+prixLitteraire;
	}
}
