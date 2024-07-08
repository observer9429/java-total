package zzAnexos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class PruebaJTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoArbol esmarco=new MarcoArbol();
	    esmarco.setVisible(true);
	    esmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
	}

}




class MarcoArbol extends JFrame{
	
	public MarcoArbol() {
		setBounds(600,100,450,200);
		setTitle("conJTree");
		
		DefaultMutableTreeNode raiz=new  DefaultMutableTreeNode("Mundo");
		
		DefaultMutableTreeNode pais=new  DefaultMutableTreeNode("España");
		
		raiz.add(pais);
		
		DefaultMutableTreeNode comunidad=new  DefaultMutableTreeNode("Madrid");
		
		pais.add(comunidad);
		
		DefaultMutableTreeNode mostoles=new  DefaultMutableTreeNode("Móstoles");
		
		comunidad.add(mostoles);
		
		DefaultMutableTreeNode alcobendas=new  DefaultMutableTreeNode("Alcobendas");
		
		comunidad.add(alcobendas);
		
		
		//*****************
		 comunidad=new  DefaultMutableTreeNode("Cantabria");
		
		pais.add(comunidad);
		
		DefaultMutableTreeNode santillana=new  DefaultMutableTreeNode("Santillana del mar");
		
		comunidad.add(mostoles);
		
		
		//*****************
		 pais=new  DefaultMutableTreeNode("Alemania");
		
		raiz.add(pais);
		
		comunidad=new  DefaultMutableTreeNode("Baviera");
		
		pais.add(comunidad);
		
		DefaultMutableTreeNode munich=new  DefaultMutableTreeNode("Munich");
		
		comunidad.add(munich);
		
		JTree arbol=new JTree(raiz);
		
		//laminaArbol milamina=new laminaArbol(arbol);
		
		//add(milamina);
		
		Container laminaContenido=getContentPane();
		
		laminaContenido.add(new JScrollPane(arbol));
	}
		
		
		
		
}

class laminaArbol extends JPanel{
	
	public laminaArbol(JTree miarbol) {
		
		setLayout(new BorderLayout());
		add(miarbol,BorderLayout.NORTH);
		
	}
	
}



