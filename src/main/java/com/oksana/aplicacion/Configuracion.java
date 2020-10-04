package com.oksana.aplicacion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.oksana.controladores", "com.oksana.aplicacion"})
public class Configuracion 
{
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		// ruta absoluta a partir de la carpeta Deployed Resources/webapp
		vr.setPrefix("/");
		// si p.ej tuvieramos la ruta Deployed Resources/webapp/MisVistas, sera  como sigue:
		// vr.setPrefix("/MisVistas/"); ...indicar "/" al final de la ruta.
		
		vr.setSuffix(".jsp");
		
		return vr;
	}
}
