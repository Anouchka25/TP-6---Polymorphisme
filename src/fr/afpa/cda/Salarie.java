package fr.afpa.cda;

public class Salarie {
	
	private int m_nMatricule;
	private int m_nCategorie;
	private int m_nService;
	private String m_strNom;
	private double m_dSalaire;
	private static int m_nCount = 0;
	
	
	public Salarie(int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire) {
		super();
		System.out.println("Création du salarié : "+m_strNom);
		this.m_nMatricule = m_nMatricule;
		this.m_nCategorie = m_nCategorie;
		this.m_nService = m_nService;
		this.m_strNom = m_strNom;
		this.m_dSalaire = m_dSalaire;
		this.m_nCount = m_nCount + 1;
	}

	public Salarie() {
		System.out.println("Je suis le constructeur par défaut, je crée un salarié par défaut :");
		this.m_nMatricule = 2;
		this.m_nCategorie = 6;
		this.m_nService = 9;
		this.m_strNom = "Mathieu DUPONT";
		this.m_dSalaire = 3000;
		this.m_nCount = m_nCount + 1;
	}
	

	public void setM_nMatricule(int m_nMatricule) {
		this.m_nMatricule = m_nMatricule;
	}
	
	public int getM_nMatricule() {
		return m_nMatricule;
	}

	public int getM_nCategorie() {
		return m_nCategorie;
	}

	public void setM_nCategorie(int m_nCategorie) {
		this.m_nCategorie = m_nCategorie;
	}

	public int getM_nService() {
		return m_nService;
	}

	public void setM_nService(int m_nService) {
		this.m_nService = m_nService;
	}

	public String getM_strNom() {
		return m_strNom;
	}

	public void setM_strNom(String m_strNom) {
		this.m_strNom = m_strNom;
	}

	public double getM_dSalaire() {
		return m_dSalaire;
	}

	public void setM_dSalaire(double m_dSalaire) {
		this.m_dSalaire = m_dSalaire;
	}
	
	public static int getM_nCount() {
		return m_nCount;
	}


    public static int compteur() {
    	return m_nCount;
    }
    
    public String toString() {
    	
		return m_nMatricule+"," +m_nCategorie+"," +m_strNom+"," +m_nService+"," +m_dSalaire;
    	
    }
    

	public String calculSalaire() {
		
		return "Le salaire de " + m_strNom + " est de " + m_dSalaire + ".";
	}
	

}
