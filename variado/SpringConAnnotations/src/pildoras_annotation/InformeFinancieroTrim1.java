package pildoras_annotation;


import org.springframework.stereotype.Component;

//la anotacion @Component es para que spring pueda scanearlo

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	
	

	
	
	
	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación del informe financiero del trimestre 1 ";
	}

	
	
	
	
	



}
