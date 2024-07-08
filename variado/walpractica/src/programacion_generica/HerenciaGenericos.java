package programacion_generica;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Empleado2 Administrativa=new Empleado2("Elena",45,1500);
		Jefe DirectoraComercial=new Jefe("Ana",27,3500);
		
		//principio de sustitucion o POLIMORFISMO es uuuuuuuuuuun
		
		Empleado2 nuevoEmpleado=DirectoraComercial;//pero no funciona asi cuando es con clases genericas

		System.out.println(nuevoEmpleado.dameDatos2());
		
		Pareja<Empleado2> otraAdministrativa=new  Pareja<Empleado2>();
		
		Pareja<Jefe> otraDirectoraComercial=new  Pareja<Jefe>();
		// ahora el polimorfismo
		//se muestra el error por heredar genericamente
	//	Pareja<Empleado2> NuevoEmpleado=otraDirectoraComercial;
		
		Pareja.imprimirTrabajador(otraAdministrativa);//ese metodo pide objeto tipo Empelado2
		
		Pareja.imprimirTrabajador(otraDirectoraComercial);
		//da error por clase generica, se soluciona/tipos comodi
		//alterando el metodo 
		//public static void imprimirTrabajador(Pareja<? extends Empleado2> p)
	}

}
