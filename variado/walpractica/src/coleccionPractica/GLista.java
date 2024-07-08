package coleccionPractica;

public class GLista {

	private GNodo primero;
	private GNodo ultimo;
	private int tamanio;
	
	public GLista() {
		
		primero=null;
		ultimo=null;
		tamanio=0;
	}
	
	public boolean isEmpty() {
		return primero==null;
	}
	
	public int size() {
		return tamanio;
	}
	
	public void addLast(String elnom) {
		
		
		GNodo elaux=new GNodo(elnom, null);
		
		if(isEmpty()) {
			
						
			primero=elaux;
			ultimo=elaux;
		}else {
			
			if(size()==1) {
				
				primero.setSiguiente(elaux);
			}else {
				
				ultimo.setSiguiente(elaux);
				
			}
			
			ultimo=elaux;
		}
		
		tamanio++;
		
		
	}
	
	
	public void verNames() {
		
		GNodo elaux=primero;
		
		while(elaux!=null) {
			
			System.out.println(elaux.getNom());
			elaux=elaux.getSiguiente();
		}
	}
	
}
