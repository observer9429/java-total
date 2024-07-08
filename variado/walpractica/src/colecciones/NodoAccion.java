package colecciones;

public class NodoAccion {

	public static void main(String[] args) {
		
		Nodo primer=new Nodo("pro");
		Nodo segundo=new Nodo(44);
		Nodo tercer=new Nodo("profesional");
		//ahora enlazamos los objetos, con nodos
		
		primer.enlazarSiguiente(segundo);
		primer.obtenerSiguiente().enlazarSiguiente(tercer);
		
		System.out.println(primer.obtenerSiguiente().obtenerSiguiente().obtenerValor().toString());
		
		System.out.println(primer.obtenerSiguiente().obtenerValor().toString());
		
		
	}

}
