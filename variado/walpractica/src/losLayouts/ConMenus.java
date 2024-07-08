package losLayouts;

import javax.swing.*;


public class ConMenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoMenu pon=new MarcoMenu();
		pon.setVisible(true);
		pon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoMenu extends JFrame{
	
	public MarcoMenu() {
		
		setTitle("con menu");
		setBounds(500,100,450,300);
		
		LaminaMenu menus=new LaminaMenu();
		add(menus);
		
	}
	
}


class LaminaMenu extends JPanel{
	
	public LaminaMenu() {
		
		JMenuBar mibarra=new JMenuBar();
		
		JMenu archivo=new JMenu("Archivo");
		JMenu edicion=new JMenu("Edición");
		JMenu herramientas=new JMenu("Herramientas");
		
		JMenu opciones=new JMenu("Opciones");
		
		JMenuItem guardar=new JMenuItem("Guardar");
		JMenuItem guardarcomo=new JMenuItem("Guardar como");
		
		JMenuItem cortar=new JMenuItem("Cortar", new ImageIcon ("bin/graficos/cortar.gif"));
		JMenuItem copiar=new JMenuItem("Copiar", new ImageIcon ("bin/graficos/copiar.gif"));
		JMenuItem pegar=new JMenuItem("Pegar", new ImageIcon ("bin/graficos/pegar.gif"));
		
		JMenuItem opcion1=new JMenuItem("opcion 1");
		JMenuItem opcion2=new JMenuItem("opcion 2");
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		
		
		JMenuItem generales=new JMenuItem("Generales");
		
		archivo.add(guardar);
		archivo.add(guardarcomo);
		
		edicion.add( cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		edicion.addSeparator();//esta linea es para agregar una linea entre los elementos
		
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		
		add(mibarra);
		
		
	}
	
}