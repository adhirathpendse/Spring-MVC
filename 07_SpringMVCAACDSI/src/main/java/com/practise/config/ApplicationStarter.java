package com.practise.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationStarter extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] classArray= {AppConfiguration.class};
		return classArray;
	}

	@Override
	protected String[] getServletMappings() {
		String [] mappings= {"/home/*"};
		return mappings;
	}

}
