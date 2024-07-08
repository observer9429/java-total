package usos;

import java.util.Date;

public class Productos {
	
	public Productos(String codigo, String seccion, String nombreart, double precio, String importado, String porigen) {
		super();
		this.codigo = codigo;
		this.seccion = seccion;
		this.nombreart = nombreart;
		this.precio = precio;
		this.importado = importado;
		this.porigen = porigen;
	}
	
	
	
	
	







	public Productos(String seccion, String nombreart, double precio, String importado, String porigen) {
		super();
		this.seccion = seccion;
		this.nombreart = nombreart;
		this.precio = precio;
		this.importado = importado;
		this.porigen = porigen;
	}












	public String getCodigo() {
		return codigo;
	}












	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}












	public String getSeccion() {
		return seccion;
	}












	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}












	public String getNombreart() {
		return nombreart;
	}












	public void setNombreart(String nombreart) {
		this.nombreart = nombreart;
	}












	public double getPrecio() {
		return precio;
	}












	public void setPrecio(double precio) {
		this.precio = precio;
	}












	public String getImportado() {
		return importado;
	}












	public void setImportado(String importado) {
		this.importado = importado;
	}












	public String getPorigen() {
		return porigen;
	}












	public void setPorigen(String porigen) {
		this.porigen = porigen;
	}












	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", seccion=" + seccion + ", nombreart=" + nombreart + ", precio="
				+ precio + ", importado=" + importado + ", porigen=" + porigen + "]";
	}












	private String codigo; 
	private String seccion;
	private String nombreart;
	private double precio;
	
	
	private String importado;
	private String porigen; 

}
