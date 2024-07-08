package pildoras.conexion;

import javax.persistence.*;

//para que haga el mapeo agregamos la anotacion convertirla en entidad y especificarle a que tabla
@Entity
@Table(name="cliente")
public class Cliente {

	
	
	
	
	public Cliente() {
		
	}

	public Cliente( String nombres, String apellidos, String direccion) {
		
		
		this.nombre = nombres;
		this.apellido = apellidos;
		this.direccion = direccion;
	}
	
	
	
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public DetallesCliente getDetallesCliente() {
		return detallesCliente;
	}

	public void setDetallesCliente(DetallesCliente detallesCliente) {
		this.detallesCliente = detallesCliente;
	}





//esa instruccion hace que se elimine en cascada

	//ESPECIFICAMOS LA RELACION QUE VAN A TENER 
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")//nombre de la columna q los relaciona
	private DetallesCliente detallesCliente;



	@Id  //con eso le indicamos que es el campo clave
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="direccion")
	private String direccion;
	
}
