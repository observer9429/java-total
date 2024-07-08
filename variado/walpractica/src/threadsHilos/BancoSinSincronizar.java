package threadsHilos;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco b=new Banco();
		
		for(int i=0;i<100;i++) {
			
			EjecucionTransferencias r=new EjecucionTransferencias(b,i,2000);
			//i es la cuenta de origen, b es el banco y 2000 monto maximo a transferir
			
			Thread t=new Thread(r);
			t.start();
			
		}
	}

}

class Banco{
	
	public Banco() {
		
		cuentas=new double [100];
		
		for(int i=0;i<cuentas.length;i++) {//solo pára llenar con 2000  a cada una dde las cuentas
			
			cuentas[i]=2000;
		}
		
		saldoSuficiente=cierreBanco.newCondition();//le decimos que al bloqueo del hilo tiene que establecerse  
		//de acuerdo a una condicion llamada saldoSuficiente
		
	}
	
	public void transferencia(int cuentaOrigen,int cuentaDestino,double cantidad) throws InterruptedException {
		
		cierreBanco.lock();//lo bloqaueamos o algo asi para que solo  ejecute un hilo
		try {
		
			/*
		if(cuentas[cuentaOrigen]<cantidad) {
			
			
			System.out.println("------------------------------Saldo insuficiente "+cuentaOrigen+"--- saldo  "
					+cuentas[cuentaOrigen]+"   cantidad invalida "+cantidad);
			
			
			return;//metodo para anular el movimiento si la transferencia es mayor al saldo de la cuenta
			// o devuelve el flujo de ejecucion y no ehecuta las lineas de abajo, SINO habrian saldos negativos 
		}else {
			
			System.out.println("-------Operación válida--- "+cuentaOrigen);
		}
		*/                      //ahora se hara con while
			
			while(cuentas[cuentaOrigen]<cantidad) {  //con el while y otros metodos,todas las
														//transferencias se realizaran
				
				saldoSuficiente.await();//ponemos el hilo a la espera, donde excede el saldo disponible
										//se libera el bloqueo y ya puede entrar otro hilo
				
				//se pueden crear mas condiciones
			}
			
		
		
		
		System.out.println(Thread.currentThread());//para ver el hilo que hace la accion
		
		cuentas[cuentaOrigen]-=cantidad;//le resta a la cuentaorigen el saldo a transferir
		
		System.out.printf("%10.2f de  %d para %d",cantidad,cuentaOrigen,cuentaDestino);
		
		cuentas[cuentaDestino]+=cantidad;
		
		//imprimimos el saldo total luego de la operacion
		
		System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());
		
		saldoSuficiente.signalAll();//despertamos a los metodos que están a la espera
		
		}finally {
			
			cierreBanco.unlock();//lo desbloqueamos para que ya el hilo en espera comienze
			//lo ponemos dentro de un finally para que siempre se ejecute esa linea de código
		}
		
		
		
		
		
	}
	
	public double getSaldoTotal() {
		
		double suma_cuentas=0;
		
		
		for(double a:cuentas) {
			suma_cuentas+=a;//el for es el que suma cada valor del array cuentas a el doublel suma_cuentas
		}
		
		return suma_cuentas;
	}
	
	private final double[] cuentas;
	
	private Lock cierreBanco=new ReentrantLock();//creamos esta instancia para poder bloquear y desbloquear
	//////los metodos, para que se ejecuten los hilos uno por uno LOCK en una interface que implementa esa clase
	
	private Condition saldoSuficiente;//para ver si hay saldo suficiente en la cuenta
	
	//private UsoThreads wen=new UsoThreads(); eplo
	
}

//*********************************************************************************

class EjecucionTransferencias implements Runnable{

	public EjecucionTransferencias(Banco b,int deorigen,double max) {
		
		banco=b;
		deLaCuenta=deorigen;
		cantidadMax=max;
		 
	}
	
	private Banco banco;//es el objeto que se crea,se usa abajo
	private int deLaCuenta;
	private double cantidadMax;
	
	public void run() {
	
		try {
		
		while(true) {//creo quie por este while se ejecuta apesar de que ya hizo transferencias  de las 100 cuent
			int paraLaCuenta=(int)(Math.random()*100);//sale la cuenta a depositar
			
			double cantidad=cantidadMax*Math.random();//la cantidad que se va a transferir, escogida al azahar
			
			banco.transferencia(deLaCuenta , paraLaCuenta, cantidad);
			
			
			Thread.sleep(1000);
		}
		
		}catch(InterruptedException e) {
			
		}
		
	}
	
}
