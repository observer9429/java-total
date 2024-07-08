package zzAnexos;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PruebaJlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Principal emarco=new Marco_Principal();
	    emarco.setVisible(true);
	    emarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
	}

}




class Marco_Principal extends JFrame{
	
	public Marco_Principal() {
		setBounds(600,100,450,450);
		setTitle("conJlist");
		
		
		String [] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre",
				"octubre","noviembre","diciembre"};
		
		
		listaMeses=new JList<String>(meses);
		
		listaMeses.setVisibleRowCount(4);
		
		
		JScrollPane laminaDespla=new JScrollPane(listaMeses);
		
		laminaLista=new JPanel();
		
		laminaLista.add(laminaDespla);
		
		
		listaMeses.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				
				List<String> valores=listaMeses.getSelectedValuesList();
				
				StringBuilder texto=new StringBuilder("MES SELECCIONADO: ");
				
				
				for(String ele:valores) {
					
					String palabra=ele;
					
					texto.append(palabra);
					
					texto.append("  ");
				}
				
				rotulo.setText(texto.toString());
				
			}
			
			
			
			
			
		});
		
		
		laminaTexto=new JPanel();
		
		rotulo=new JLabel("mes seleccionado");
		
		laminaTexto.add(rotulo);
		
		add(laminaLista,BorderLayout.NORTH);
		
		add(laminaTexto,BorderLayout.SOUTH);
		
		
		}
		
		
		
		
		
	
	
	
	
	private JList<String> listaMeses;
	
	private JPanel laminaLista,laminaTexto;
	
	private JLabel rotulo;
}


