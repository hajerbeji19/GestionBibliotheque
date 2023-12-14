package GestionBibliotheque;

class Document {
	private int num;
	private String titre;
	public Document(int num, String titre) {
		this.num=num;
		this.titre=titre;
	}
	
	//getters et setters
	public int getNum() {
		return num;
	}
	public String getTitre() {
		return titre;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public void setTitre(String titre) {
		this.titre=titre;
	}
	
	@Override
	public String toString() {
		return "Livres[numero: "+num+", titre: "+titre;
	}

}
