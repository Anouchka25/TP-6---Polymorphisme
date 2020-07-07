/**
 * TP 5 : 
 */
package fr.afpa.cda;

import java.util.Enumeration;
import java.util.Hashtable;

public class Application {

	public static void main(String[] args) {
		
		Hashtable dict = new Hashtable();
		
		
		
        Salarie s = new Salarie(5, 8, 14, "Anouchka MINKOUE OBAME", 1500);
		Integer key = new Integer(s.getM_nMatricule());
        dict.put(key, s);
		
        s = new Salarie(3, 1, 20, "Isodore DUMARC", 10000);
        dict.put(key, s);
        
        s = new Commercial(6, 2, 30, "Mathieu LEBLOND", 17000, 52000, 9);
        dict.put(key, s);
        
        /**
         * Ici on ajoute chaque élement dict.element() à l'Enumeration
          */
        for (Enumeration e = dict.elements(); e.hasMoreElements() ;)  
        {
        	Salarie sal = (Salarie)e.nextElement();
        	System.out.println(sal);
        	System.out.println(sal.calculSalaire());
        }
		
		
ffffffffffffffffffff
		
	}

}
