package pildoras_annotation;
import org.springframework.stereotype.Component;

//la anotacion @Component es para que spring pueda scanearlo

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación favorable del Trimestre 3";
	}

}
