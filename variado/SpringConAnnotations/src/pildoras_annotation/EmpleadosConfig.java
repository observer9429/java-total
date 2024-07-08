package pildoras_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("pildoras_annotation")//si hay ams paquetes se ponen * o uno a uno
//OTRO TEMA, LE INDICAMOS LA RUTA DEL ARCHIVO DONDE ESTAN LOSVALORES DE LAS PROPIEDADES
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	//definir el bean para InformeFinancieroDptoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDptoCompras() {
		//esto será el id del Bean inyectado
		return new InformeFinancieroDptoCompras();
	}
	
	
	//definir el Bean para DirectorFinanciero  e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDptoCompras());
	}
	
}
