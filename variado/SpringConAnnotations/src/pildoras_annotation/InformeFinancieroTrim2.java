package pildoras_annotation;
import org.springframework.stereotype.Component;

//la anotacion @Component es para que spring pueda scanearlo

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación del informe catastrófico del trimestre 2";
	}

}
