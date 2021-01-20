package com.learn.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {
	            AppContext.class
	        };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	
		return new Class[] {MyConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
