package losLayouts;
import javax.swing.*;

public class SpringResorte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoResorte elspring=new MarcoResorte();
		elspring.setVisible(true);
		elspring.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoResorte extends JFrame{
	
	public MarcoResorte() {
		setTitle("Resorte o Muelee");
		setBounds(400,40,600,250);
		
		LaminaResorte wex=new LaminaResorte();
		add(wex);
	}
	
}



class LaminaResorte extends JPanel{
	
	public LaminaResorte(){
		
		JButton boton1=new JButton("boton 1");
		JButton boton2=new JButton("boton 2");
		JButton boton3=new JButton("boton 3");
		
		SpringLayout milayout=new SpringLayout();
		
		setLayout(milayout);
		
		
		add(boton1);// son 4 resortes en total
		add(boton2);
		add(boton3);
		
		Spring mimuelle=Spring.constant(10, 10, 150);
		//el priemro comienza muelle izquierdo del primero boton y termina en el borde izquierdo del panel
		
		
		Spring mulellerigido=Spring.constant(50);
		//para poner resortes fijos , se crea otro muellerigido pero con solo un parametro que es la distancia
		milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
		milayout.putConstraint(SpringLayout.WEST, boton2, mimuelle, SpringLayout.EAST, boton1);
		milayout.putConstraint(SpringLayout.WEST, boton3, mimuelle, SpringLayout.EAST, boton2);
		milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
		
	}
}