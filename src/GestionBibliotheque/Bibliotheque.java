package GestionBibliotheque;

class Bibliotheque {
	public static int compteur;
	private Document[] documents;
	public Bibliotheque() {
		documents=new Document[100];
		compteur=0;
	}
	public void afficherDocuments() {
		for(int i=0;i<compteur;i++) {
			System.out.println(documents[i].toString());
		}
	}
	public Document findDocument(int numEnreg) {
		for(int i=0;i<compteur;i++) {
			if(documents[i].getNum()==numEnreg) {
				return documents[i];
			}
		}
		return null;
	}
	public void ajouter(Document doc) {
		if(compteur<documents.length) {
			documents[compteur]=doc;
			compteur++;
		}
		else {
			System.out.println("Tableau saturé !");
		}
	}
}
