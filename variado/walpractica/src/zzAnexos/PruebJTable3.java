package zzAnexos;

import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;


public class PruebJTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame wmarco=new tablaPersonalizado();
		wmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wmarco.setVisible(true);
	}

}

class tablaPersonalizado extends JFrame{
	
	public tablaPersonalizado() {
		
		setTitle("tabla 2");
		setBounds(700,200,400,550);
		
		JPanel superior=new JPanel();
		
		nombreTablas=new JComboBox();
		
		try {
			
			laCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/ver", "root", "");
			
			datosBBDD=laCon.getMetaData();
			
			rs=datosBBDD.getTables(null, null, null, null);
			
			while(rs.next()) {
				
				nombreTablas.addItem(rs.getString("TABLE_NAME"));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//damos accion al jcombobox
		nombreTablas.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String tablaSeleccionada=(String)nombreTablas.getSelectedItem();
				
				String consql="SELECT * FROM "+tablaSeleccionada;
				
				try {
					sentencia=laCon.createStatement();
					rs=sentencia.executeQuery(consql);
					
					/*
					while(rs.next()) {
						
						System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
						
					}*/
					
					modelo=new verTabla(rs);
					
					JTable tabla=new  JTable(modelo);
					
					JScrollPane nn=new JScrollPane(tabla);
					
					add(new JScrollPane(tabla),BorderLayout.CENTER);
					
					validate();
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
			
		});
		
		
		
		
		superior.add(nombreTablas);
		
		add(superior,BorderLayout.NORTH);
		
	}
	
	private JComboBox nombreTablas;
	
	private DatabaseMetaData datosBBDD;
	private ResultSet rs;
	private Connection laCon;
	
	
	private Statement sentencia;
	
	private verTabla modelo;
	
	
}

class verTabla extends AbstractTableModel{

	
	public verTabla(ResultSet elRs) {
		
		elResult=elRs;
		
		try {
			
			
			rsmeta=elResult.getMetaData();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		try {
			
			return rsmeta.getColumnCount();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		try {
			
		
		elResult.last();
		
		return elResult.getRow();
		} catch (Exception e) {
			// TODO: handle exception
			
			return 0;
		}
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
		try {
			
			elResult.absolute(arg0+1);
			
			return elResult.getObject(arg1+1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
		}
	
	}
	
	
	
	public String getColumnName(int c) {
		
		try {
			return rsmeta.getColumnName(c+1);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	private ResultSet elResult;
	private ResultSetMetaData rsmeta;
}

