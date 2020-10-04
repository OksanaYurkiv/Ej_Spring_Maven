package com.oksana.aplicacion;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Web extends AbstractAnnotationConfigDispatcherServletInitializer 
{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {Configuracion.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}				