package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class EventoRaton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaRaton2 accion2=new JavaRaton2();
		accion2.setVisible(true);
		accion2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class JavaRaton2 extends JFrame{
	
	public JavaRaton2() {
		
		setBounds(700,300,250,240);
		setTitle("eventos de raton 2");
		EventosDeRaton001 laaccion=new EventosDeRaton001();
		addMouseListener(laaccion);
		
		}
	
}
//con la interfase MouseMotionListener puedes verificar si se esta arrastrando el mouse y si se esta moviendo

class EventosDeRaton001 extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("has hecho click");
		System.out.println("en la coordenada X: "+e.getX()+" y en la coordenada Y "+e.getY());
		
		System.out.println(e.getClickCount());
	}
	
	public void mousePressed(MouseEvent e) {// METDO PARA SABER QUE CLICK PRESIONO(DERECHO O IZQUIERDO) O RATON
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println(e.getModifiersEx()+" has presionado el click izquierdo");
		}
	}
	
}