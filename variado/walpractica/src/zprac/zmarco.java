package zprac;

import javax.swing.*;
import java.sql.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

class zmarco extends JFrame{

	public zmarco(){
		
		zConecta();
		
		setBounds(800,100,400,600);
		setTitle("marcozz");
		
		zpanel ed=new zpanel(zCon);
		
		add(ed);
		
		
	}
	
	
	public void zConecta() {
		
		try {
		zCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/literarios", "root","");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "error al conectar");
		}
	}
	
	Connection zCon;
}


class zpanel extends JPanel {
	
	Connection con;
	
	public zpanel(Connection e) {
		
		con=e;
		
		setLayout(null);
		
		elbot.setBounds(10, 10, 70, 25);
		add(elbot);
		eltex.setBounds(10, 40, 100, 25);
		add(eltex);
		elac.setBounds(10, 70, 125, 25);
		add(elac);
		
		ALinsertar wex=new ALinsertar();
		elac.addActionListener(wex);
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		g.drawString("noche", 200, 400);
		//g.drawOval(10, 10, 15, 15);
		
		Graphics2D g2=(Graphics2D) g;
		
		Ellipse2D elipse=new Ellipse2D.Double(100,100,10,10);
		
		g2.draw(elipse);
		g2.fill(elipse);
		
		
		
		g2.drawOval(150, 150, 15, 15);
		
	}
	
	
	public class ALinsertar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String cod=eltex.getText();
			
			
			try {
			PreparedStatement elprep=con.prepareStatement("INSERT INTO codigos(loscodigos) VALUES(?)");
			
			elprep.setString(1, cod);
			elprep.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "codigo registrado con exito");
			
			eltex.setText("");
			
			}catch(Exception po) {
				
				
				
				JOptionPane.showMessageDialog(null, "error al insertar lso datos");
				
			}
			
			
			
			
			
		}
		
		
		
	}
	
	
	
	JLabel elbot=new JLabel("código");
	JTextField eltex=new JTextField("",25);
	JButton elac=new JButton("insertar codigo");

	
	

	
	
	
}
