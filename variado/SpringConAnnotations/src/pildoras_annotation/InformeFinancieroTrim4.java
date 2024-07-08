package pildoras_annotation;
import org.springframework.stereotype.Component;

//la anotacion @Component es para que spring pueda scanearlo

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacón de informe de cierre de año";
	}

}
