package threadsHilos;

public class SincronizandoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		HilosVarios hilo1=new HilosVarios();
		HilosVarios hilo2=new HilosVarios();
		
		hilo1.start();
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hilo2.start();
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//*********************************************otra forma de sincronizarlo, al parecer mas eficiente
													//con VariosHilos2
		HilosVarios hilo1=new HilosVarios();
		HilosVarios2 hilo2=new HilosVarios2(hilo1);
		
		hilo2.start();
		hilo1.start();
		
		
		
		
		
		//se pone el metodo join tambien en hilo2, ya que sino se mezclaria con el syso
		System.out.println("se terminaron las tareas");
		
	}

}


class HilosVarios extends Thread{
	
	public void run() {
		
		for(int i=0;i<15;i++) {
			System.out.println("Ejecutando hilo "+ getName());
			
			try {
				Thread.sleep(500);//metodo para hacer que demore medio segundo
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class HilosVarios2 extends Thread{
	
	public HilosVarios2(Thread hilo) {
		
		this.hilo=hilo;
	}
	
	public void run() {
		
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i=0;i<15;i++) {
			System.out.println("Ejecutando hilo "+ getName());
			
			try {
				Thread.sleep(500);//metodo para hacer que demore medio segundo
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private Thread hilo;
	
}