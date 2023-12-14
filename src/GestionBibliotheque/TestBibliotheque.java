package GestionBibliotheque;

public class TestBibliotheque {

	public static void main(String[] args) {
		Bibliotheque list=new Bibliotheque();
		Livre doc1=new Livre(11, "LLivre", "Hajer",20);
		Livre doc2=new Roman(12, "RRoman" ,"Beji",50,500);
		Document doc3=new Dictionnaire(13,"DDictionnaire","english");
		Manuel doc4=new Manuel(14, "MManuel",3);
		list.ajouter(doc1);
		list.ajouter(doc2);
		list.ajouter(doc3);
		list.ajouter(doc4);
		
		System.out.println("Affichage de liste :");
		list.afficherDocuments();
		
		Document res1=list.findDocument(11);
		Document res2=list.findDocument(20);
		
		System.out.println("Chercher le document ayant numero 11");
		if(res1==null) {
			System.out.println("Document non trouvable");
		}
		else {
			System.out.println(res1);
		}
		
		System.out.println("Chercher le document ayant numero 20");
		if(res2==null) {
			System.out.println("Document non trouvable");
		}
		else {
			System.out.println(res2);
		}
	}
}
