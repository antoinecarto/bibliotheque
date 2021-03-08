package bibliotheque;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import bibliotheque.*;

public class ExemplairesDao {
	
private Exemplaire[] exemplaireDB = {
		
			
			new Exemplaire(1, new GregorianCalendar(2001, Calendar.JANUARY, 12).getTime(),EnumStatusExemplaire.DISPONIBLE,"CGV"),
			new Exemplaire(2,new GregorianCalendar(2007, Calendar.FEBRUARY,13).getTime(),EnumStatusExemplaire.DISPONIBLE,"OJI"),
			new Exemplaire(3,new GregorianCalendar(1998, Calendar.MARCH,17).getTime(),EnumStatusExemplaire.PRETE,"SEQ"),
			new Exemplaire(4,new GregorianCalendar(1999, Calendar.APRIL,7).getTime(),EnumStatusExemplaire.PRETE,"RDE"),
			new Exemplaire(5,new GregorianCalendar(2001, Calendar.MAY,12).getTime(),EnumStatusExemplaire.SUPPRIME,"PLO"),
			new Exemplaire(6,new GregorianCalendar(2014, Calendar.JUNE,9).getTime(),EnumStatusExemplaire.SUPPRIME,"VOK"),

			
	};

public Exemplaire findByKey(int id) {
	
	for(Exemplaire e : exemplaireDB) {
		if(e.getIdExemplaire() == id) {
			return e;
		}
	}
	return null;
}

	public static void main(String[] args) {
		
		
	}

}

