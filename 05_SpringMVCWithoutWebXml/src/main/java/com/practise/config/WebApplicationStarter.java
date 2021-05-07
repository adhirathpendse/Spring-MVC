/**
 * 
 */
package com.practise.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author sony
 *
 */
public class WebApplicationStarter implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		//Use below line when Beans.xml is placed in src/main/resources folder
		/*webApplicationContext.setConfigLocation("classpath:Beans.xml");*/
		//Use below line when Beans.xml is placed in WEB-INF/
		webApplicationContext.setConfigLocation("/WEB-INF/Beans.xml");
		DispatcherServlet dispatcherServlet= new DispatcherServlet(webApplicationContext);
		Dynamic dynamic= servletContext.addServlet("FrontController", dispatcherServlet);
		
		dynamic.addMapping("/home/*");
		dynamic.setLoadOnStartup(1);
		
	}
	

}
