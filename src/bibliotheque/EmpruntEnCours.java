package bibliotheque;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class EmpruntEnCours {
	private Date dateEmprunt;
	@SuppressWarnings("unused")
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Utilisateur u;
	Exemplaire ex;
	private EnumStatusExemplaire EnumStatusExemplaire;
	
	
	
	
	public EmpruntEnCours(Date dateEmprunt, Utilisateur u, Exemplaire ex) {
		if (ex.getEnumStatusExemplaire() == EnumStatusExemplaire.PRETE || ex.getEnumStatusExemplaire() == EnumStatusExemplaire.SUPPRIME){
			System.out.println("Erreur : Livre non disponible");
		} else {
			ex.setEnumStatusExemplaire(EnumStatusExemplaire.PRETE);
			this.ex = ex;
			this.u = u;
			this.dateEmprunt = dateEmprunt;
		}
	}
	

	public EmpruntEnCours(Date dateEmprunt, Exemplaire ex) {
		if (ex.getEnumStatusExemplaire() == EnumStatusExemplaire.PRETE || ex.getEnumStatusExemplaire() == EnumStatusExemplaire.SUPPRIME){
			System.out.println("Erreur : Livre non disponible");
		} else {
			ex.setEnumStatusExemplaire(EnumStatusExemplaire.PRETE);
			this.ex = ex;
			this.dateEmprunt = dateEmprunt;
			getU();
		}
	}
	
	
	
	
	public EnumStatusExemplaire getEnumStatusExemplaire() {
		return EnumStatusExemplaire;
	}


	public void setEnumStatusExemplaire(EnumStatusExemplaire enumStatusExemplaire) {
		EnumStatusExemplaire = enumStatusExemplaire;
	}


	public Utilisateur getU() {
		return u;
	}

	public void setU(Utilisateur u) {
		this.u = u;
	}

	public Exemplaire getEx() {
		return ex;
	}

	public void setEx(Exemplaire ex) {
		this.ex = ex;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	@Override
	public String toString() {
		return "EmpruntEnCours [ dateEmprunt = " + dateEmprunt + ", utilisateur = " + u + ", exemplaire = " + ex + " ]\n";
	}

	public static void main(String[] args) throws ParseException {
		
	}


	

}
