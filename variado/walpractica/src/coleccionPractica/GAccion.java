package coleccionPractica;

public class GAccion {

	public static void main(String[] args) {
		
		GLista elnew=new GLista();
		
		System.out.println(elnew.isEmpty());
		
		elnew.addLast("mark");
		elnew.addLast("piter");
		elnew.addLast("spiderman");
		elnew.addLast("batman");
		elnew.addLast("DEXTER");
		
		System.out.println(elnew.isEmpty());
		System.out.println(elnew.size());
		
		
		elnew.verNames();

	}

}
