package pildoras.conexion;

import javax.persistence.*;

//para que haga el mapeo agregamos la anotacion convertirla en entidad y especificarle a que tabla
@Entity
@Table(name="clientes")
public class Clientes {

	
	
	
	
	public Clientes() {
		
	}

	public Clientes( String nombres, String apellidos, String direccion) {
		
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}





	@Id  //con eso le indicamos que es el campo clave
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Nombres")
	private String nombres;
	
	@Column(name="Apellidos")
	private String apellidos;
	
	@Column(name="Direccion")
	private String direccion;
	
}
