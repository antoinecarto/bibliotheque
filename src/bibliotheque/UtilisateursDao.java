package bibliotheque;



public class UtilisateursDao {
	private Utilisateur [] UtilisateursDB =  {
			new Adherent("a", "aa",1,"mdp1", "pseudo1","01.54.67.98.34"),
			new Adherent("b","bb",2,"mdp2", "pseudo2","07.56.89.76.01"),
			new Adherent("c","cc",3,"mdp3", "pseudo3","05.12.98.35.42"),
			new Employe("d","dd",4,"mdp4", "pseudo4'","01",EnumCategorieEmploye.BIBLIOTHECAIRE),
			new Employe("e","ee",5,"mdp5", "pseudo5","02",EnumCategorieEmploye.BIBLIOTHECAIRE),
			new Employe("f","ff",6,"mdp6", "pseudo6","03",EnumCategorieEmploye.RESPONSABLE)
	};
	
	// m�thode qui retourne l'utilisateur dont on fournit l'identifiant
	public Utilisateur findById (Integer idUtilisateur) {
		for (Utilisateur utilisateur : UtilisateursDB) {
			if (utilisateur.getIdUtilisateur().equals(idUtilisateur)) {
				return utilisateur;
			}
		}
		return null;
	}
	
	
	
}
