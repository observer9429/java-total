package zzAnexos;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class PruebaJTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame zmarco=new marcoPersonalizado();
		zmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		zmarco.setVisible(true);
	}

}

class marcoPersonalizado extends JFrame{
	
	public marcoPersonalizado() {
		
		setTitle("tabla 2");
		setBounds(700,200,400,550);
		
		TableModel elModelo=new ModeloTabla();
		
		JTable  tabla=new JTable(elModelo);
		
		add(new JScrollPane(tabla));
		
	}
}


class ModeloTabla extends AbstractTableModel{

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columIndex) {

		int z=rowIndex+1;
		int y=columIndex+1;
		
		return " "+z+" "+y;
	}
	
	public String getColumnName(int c) {
		
		return "Columna "+c;
	}
	
}