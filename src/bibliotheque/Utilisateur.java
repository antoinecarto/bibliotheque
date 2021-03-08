package bibliotheque;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;


public class Utilisateur extends Personne implements NommableUtilisateur{
	private Integer idUtilisateur;
	private String pwd;
	private String pseudonyme;
	protected ArrayList<EmpruntEnCours> emprunts = new ArrayList<EmpruntEnCours>();
	private Integer nbEmpruntsEnCours=0;
	protected ArrayList<EmpruntArchive> archives = new ArrayList<EmpruntArchive>();
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe,Integer idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}
	
	
	
	public Utilisateur(String nom, String prenom, Integer idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}

	
	
	public Integer getNbEmpruntsEnCours() {
		return nbEmpruntsEnCours;
	}



	public void setNbEmpruntsEnCours(Integer nbEmpruntsEnCours) {
		this.nbEmpruntsEnCours = nbEmpruntsEnCours;
	}



	public Utilisateur(String nom, String prenom) {
		super(nom, prenom);
	}


	public ArrayList<EmpruntEnCours> getEmprunts() {
		return emprunts;
	}


	public void setEmprunts(ArrayList<EmpruntEnCours> emprunts) {
		this.emprunts = emprunts;
	}


	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getPseudonyme() {
		return pseudonyme;
	}


	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
	
	
	public void addEmpruntEnCours(EmpruntEnCours ep) throws BiblioException  {
		if (ep.getEnumStatusExemplaire() == EnumStatusExemplaire.PRETE || ep.getEnumStatusExemplaire() == EnumStatusExemplaire.SUPPRIME){
			throw new BiblioException();
		} else {
			emprunts.add(ep);
			/*if (ep.getU()!=this) {
			ep.setU(this);
			}*/
			ep.setEnumStatusExemplaire(EnumStatusExemplaire.PRETE);
			nbEmpruntsEnCours++;
		}
	}
	
	public boolean containsExemplaire (Exemplaire ex) {
		if (ex.getEnumStatusExemplaire() == EnumStatusExemplaire.PRETE) {
			return true;
		} else {
			return false;
		}
	}
	
	public void removeEmprunts(EmpruntEnCours eep, Exemplaire ex, EmpruntArchive ea) {
		if (emprunts.size() < 1) {
			System.out.println("Erreur : Aucun livre emprunt�");
		} else if (!containsExemplaire(ex)){
			System.out.println("Erreur : Livre non emprunt�");
		} else {
			emprunts.remove(eep);
			archives.add(ea);
			ex.setEnumStatusExemplaire(EnumStatusExemplaire.DISPONIBLE);
			eep.setDateEmprunt(null);
			eep.setEx(null);
			eep.setU(null);
			nbEmpruntsEnCours--;
		}
	}
	
	@Override
	public String toString() {
		if (emprunts.size()>0) {
			return "Utilisateur [" + super.toString() + ", idUtilisateur = "
					+ idUtilisateur + ", pwd = " + pwd + ", pseudonyme = " + pseudonyme + ", \n emprunts en cours = \n" + emprunts.toString() + " ]";
		} else {
			return "Utilisateur [" + super.toString() + ", idUtilisateur = "
					+ idUtilisateur + ", pwd = " + pwd + ", pseudonyme = " + pseudonyme + "]";
		}
	}
	
	
	public static void main(String []args) throws BiblioException, ParseException  {
		
	}
			
}
