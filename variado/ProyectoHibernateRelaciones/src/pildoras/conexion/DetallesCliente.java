package pildoras.conexion;

import javax.persistence.*;

//para que haga el mapeo agregamos la anotacion convertirla en entidad y especificarle a que tabla
@Entity
@Table(name="detalles_cliente")
public class DetallesCliente {

	
	
	
	
	public DetallesCliente(String web, String telefono, String comentarios) {
	
		this.web = web;
		this.telefono = telefono;
		this.comentarios = comentarios;
	}

	public DetallesCliente() {
		
	}

	





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	
	


	
	public Cliente getElCliente() {
		return elCliente;
	}

	public void setElCliente(Cliente elCliente) {
		this.elCliente = elCliente;
	}



	//para que la busqueda vaya en ambas relaciones y no solo en una aca tambien crearemos una variable de la otra clase
	
	@OneToOne(mappedBy="detallesCliente", cascade=CascadeType.ALL)
	private Cliente elCliente;



	@Id  //con eso le indicamos que es el campo clave
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="web")
	private String web;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="comentarios")
	private String comentarios;
	
}
