package colecciones;

public class Libro {//SIEMPRE QUE SOCREESCRIBAS EL METODO EQUALS, HABRÁ QUE SOBREESCRIBIR EL METODO HASHCODE
	
	public Libro(String titulo, String autor, int ISBN) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
		
		
	}
	
	
	public String getDatos() {
		
		return "El título es "+titulo+" , el autor es: "+autor+" y el ISBN es: "+ISBN;
	}
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}


	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	
	
	
	private String titulo;
	private String autor;
	private int ISBN;

}
