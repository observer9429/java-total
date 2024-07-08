package pack001;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

class LayoutRegistro implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
		
		//int d=micontenedor.getWidth();// esta variable ayuda en el calculo para poner los elmentso al centro
		
		x=20;
		
		int contador=0;
		
		int n=micontenedor.getComponentCount();
		
		for(int i=0;i<n;i++) {
			
			
			contador++;
			
			Component c=micontenedor.getComponent(i);
			
			c.setBounds(x, y, 120, 20);
			
			x+=150;
			
			if(contador%2==0) {
				x=20;
				y+=40;
			}
			
			
			//llave del else
			
		}
		
		//-----------------------------------------------
		System.out.println("  "+x);
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	
	private int x;
	private int y=20;
	
}
