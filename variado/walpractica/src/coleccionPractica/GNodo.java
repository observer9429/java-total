package coleccionPractica;

public class GNodo {
	
	private String nom;
	private GNodo siguiente;
	
	

	public GNodo(String nom, GNodo siguiente) {
		
		this.nom = nom;
		this.siguiente = siguiente;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public GNodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(GNodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	

}
