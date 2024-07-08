package losLayouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.text.*;
import javax.swing.text.StyledEditorKit.BoldAction;

public class TareaHecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoHecho99 mira=new MarcoHecho99();
		mira.setVisible(true);
		mira.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoHecho99 extends JFrame{
	
	public MarcoHecho99() {
		
		setTitle("Tarea001");
		setBounds(500,40,450,350);
		
		LaminaHecha lamhecha=new LaminaHecha();
		add(lamhecha);
	}
}


class LaminaHecha extends JPanel{
	
	public LaminaHecha(){
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		
		JMenuBar mibarra=new JMenuBar();
		//--------------------------------------
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamagno=new JMenu("Tamaño");
		//----------------------------------------
		configura_menu("Arial","fuente","Arial",9,10,"");//los 2 ultimos parametros que recibe no afecta, y se pone
		configura_menu("Courier","fuente","Courier",9,10,"");//un valor en blanco o uno que no afecte
		configura_menu("Verdana","fuente","Verdana",9,10,"");
	
		//------------------------------------
		
		configura_menu("Negrita","estilo","",Font.BOLD,1,"bin/graficos/negro.png");//cambia el estilo
		configura_menu("Cursiva","estilo","",Font.ITALIC,1,"bin/graficos/verde.jpg");
		
		/*
		JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita",new ImageIcon("bin/graficos/negro.png"));
		JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva",new ImageIcon("bin/graficos/verde.jpg"));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		estilo.add(negrita);
		estilo.add(cursiva);
		
		*/
		//--------------------------------
		
		/*
		configura_menu("12","tamaño","",9,12,"");//cambia el tamaño
		configura_menu("16","tamaño","",9,16,"");
		configura_menu("20","tamaño","",9,20,"");
		configura_menu("24","tamaño","",9,24,"");
		*/
		
		ButtonGroup tamagno_letra=new ButtonGroup();
		JRadioButtonMenuItem doce=new  JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis=new  JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte=new  JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro=new  JRadioButtonMenuItem("24");
		
		tamagno_letra.add(doce);
		tamagno_letra.add(dieciseis);
		tamagno_letra.add(veinte);
		tamagno_letra.add(veinticuatro);
		
		
		//la clase styled la instanciamos defrente, o algo oa si es como un metodo que ya hace lo que uno quiere
		doce.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO",12));//el nom cambiatamaño, es presindible
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO",16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO",20));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("CAMBIA_TAMAÑO",24));
		
		//asignar atajo teclado
		
		veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		
		tamagno.add(doce);
		tamagno.add(dieciseis);
		tamagno.add(veinte);
		tamagno.add(veinticuatro);
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu,BorderLayout.NORTH);
		
		 miarea= new JTextPane();
		add(miarea,BorderLayout.CENTER);
		
		JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem negritaE=new JMenuItem("Negrita");
		JMenuItem cursivaE=new JMenuItem("Cursiva");
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		emergente.add(negritaE);
		emergente.add(cursivaE);
		
		
		miarea.setComponentPopupMenu(emergente);
		///////-------------------------------------------------------------------
		JToolBar barra=new JToolBar();
		
		JButton negritaBarra=new JButton("N");
		JButton cursivaBarra=new JButton("K");
		JButton subraBarra=new JButton("S");
		
		JButton verdeBarra=new JButton(new ImageIcon("src/graficos/verde.jpg"));//instanciamos Image ahi mismo
		JButton plomoBarra=new JButton("LETRA PLOMA");
		
		JButton ai=new JButton("AI");
		JButton ac=new JButton("AC");
		JButton ad=new JButton("AD");
		JButton aj=new JButton("AJ");
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		
		verdeBarra.addActionListener(new StyledEditorKit.ForegroundAction("nombre prescindible", Color.GREEN));
		plomoBarra.addActionListener(new StyledEditorKit.ForegroundAction("elweee", Color.LIGHT_GRAY));
		
		
		ai.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
		ac.addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
		ad.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
		aj.addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
		
		
		
		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subraBarra);
		
		barra.add(verdeBarra);
		barra.add(plomoBarra);
		
		barra.add(ai);
		barra.add(ac);
		barra.add(ad);
		barra.add(aj);
		//para la orientacion de la barra en vertical
		barra.setOrientation(1);
		add(barra,BorderLayout.WEST);
		
	}
	
	public void configura_menu(String rotulo,String menu,String tipo_letra,int estilos,int tam, String ruta_icono) {
		JMenuItem elem_menu=new JMenuItem(rotulo,new ImageIcon(ruta_icono));
		
		if(menu=="fuente") {
			fuente.add(elem_menu);
			
			if(tipo_letra=="Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Arial"));
			}
			else if(tipo_letra=="Courier") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Courier"));
			}
			else if(tipo_letra=="Verdana") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Verdana"));
			}
			
			
		}
		else if(menu=="estilo") {
			estilo.add(elem_menu);
			
			if(estilos==Font.BOLD) {
				
			elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));	
				
			elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}
			else if(estilos==Font.ITALIC) {
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
				
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
			
		}
		
		
		else if(menu=="tamaño") {
			tamagno.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiatam", tam));
		}
		
		//elem_menu.addActionListener(new Gestiona_Eventos(rotulo,tipo_letra,estilos,tam));
	}
	
	/*
	private class Gestiona_Eventos implements ActionListener{

		String tipo_texto, menu;
		
		int estilo_letra,tamagno_letra;
		
		Gestiona_Eventos(String elemento,String texto2, int estilo2, int tam_letra){
			
			tipo_texto=texto2;
			estilo_letra=estilo2;
			tamagno_letra= tam_letra;
			menu=elemento;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			letras=miarea.getFont();
			//luego obtenemos sus diferentes propiedades
			if(menu=="Arial"  || menu=="Courier" || menu=="Verdana") {// funcionaria con e.getSource()=="arial"
				
				//System.out.println(menu);
				estilo_letra=letras.getStyle();
				tamagno_letra=letras.getSize();
				
			}else if(menu=="Cursiva" || menu=="Negrita" ) {
				
				if(letras.getStyle()==1 || letras.getStyle()==2) {
					
					estilo_letra=3;
				}
				
				tipo_texto=letras.getFontName();
				tamagno_letra=letras.getSize();
				
			}else if(menu=="12" ||menu=="16" || menu=="20" || menu=="24") {
				
				estilo_letra=letras.getStyle();
				tipo_texto=letras.getFontName();
			}
			
			miarea.setFont(new Font(tipo_texto,estilo_letra,tamagno_letra));
			
			
		}
		
	}
	
	*/
	JTextPane miarea;
	
	JMenu fuente,estilo,tamagno;
	
	Font letras;
}