package bibliotheque;

public class BiblioException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public BiblioException() {
		super("Erreur : Pas possible !");
	}
	
	public BiblioException (String message) {
		super(message);
	}
	

	public static void main(String[] args) {
		System.out.println(new BiblioException());
		System.out.println(new BiblioException("livre non disponible"));
	}

}

	
	

