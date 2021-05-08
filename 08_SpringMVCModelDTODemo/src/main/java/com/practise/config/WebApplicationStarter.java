package com.practise.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationStarter implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ApplicationSpringConfiguration.class);
		
		DispatcherServlet dispatcherServlet=new DispatcherServlet(context);
		
		Dynamic frontController= servletContext.addServlet("DispatcherServlet1", dispatcherServlet);
		
		frontController.addMapping("/home/*");
		frontController.setLoadOnStartup(1);
		
		}
	

}
