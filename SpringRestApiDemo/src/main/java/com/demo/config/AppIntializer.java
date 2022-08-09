package com.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {JdbcTemplateFile.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return  new Class[] {ViewResolverXml.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
