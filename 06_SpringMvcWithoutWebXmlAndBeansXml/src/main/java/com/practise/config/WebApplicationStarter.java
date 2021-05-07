/**
 * 
 */
package com.practise.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author sony
 *
 */
public class WebApplicationStarter implements WebApplicationInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.
	 * ServletContext)
	 */
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context= new AnnotationConfigWebApplicationContext();
		context.register(BeansConfiguration.class);

		DispatcherServlet frontController = new DispatcherServlet(context);

		Dynamic dynamic = servletContext.addServlet("FrontController", frontController);

		dynamic.addMapping("/home/*");

		dynamic.setLoadOnStartup(1);

	}

}
