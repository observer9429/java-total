package losLayouts;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ConJslider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoJslider ve=new MarcoJslider();
		ve.setVisible(true);
		ve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoJslider extends JFrame{
	
	public MarcoJslider() {
		
		setTitle("radio boton");
		setBounds(500,100,450,300);
		
		LaminaJslider lamslider=new LaminaJslider();
		add(lamslider);
	}
	
}


class LaminaJslider extends JPanel{
	
	public LaminaJslider() {
		
		//JSlider control=new JSlider(0,100,25);//se puede poenr vertical, poniendo SwingConstants.VERTICAL,
		                          //como priemr parametro
		setLayout(new BorderLayout());
		
		rotulo=new JLabel("viene el chicharito y marca el gooool!!!!");
		add(rotulo,BorderLayout.CENTER);
		
		control=new JSlider(8,50,16);
		
		control.setMajorTickSpacing(25);//INTERVALO AMYOR
		control.setMinorTickSpacing(5);//INTERVALO MENOR
		control.setPaintTicks(true);//PINTAR LAS RAYAS
		control.setPaintLabels(true);//PINTAR LOS NUMEROS
		control.setFont(new Font("Serif",Font.ITALIC,10));//DEFINIR FORMATO LETRA
		
		JPanel laminaslider=new JPanel();
		
		laminaslider.add(control);
		add(laminaslider,BorderLayout.NORTH);
		//add(control,BorderLayout.SOUTH);
		
		control.addChangeListener(new EventoPes());//lo instancio directo
	}
	
	private class EventoPes implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("ala p mano "+control.getValue());// el getvalur, nos da el numero escogido
			
			rotulo.setFont(new Font("Serif",Font.PLAIN,control.getValue()));//get value, da el valor entero
		}
		
	}
	
	private JLabel  rotulo;
	private JSlider control;
	
}