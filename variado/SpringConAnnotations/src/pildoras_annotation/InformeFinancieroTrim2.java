package pildoras_annotation;
import org.springframework.stereotype.Component;

//la anotacion @Component es para que spring pueda scanearlo

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentaci�n del informe catastr�fico del trimestre 2";
	}

}
