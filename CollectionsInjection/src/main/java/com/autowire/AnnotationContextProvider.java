package com.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContextProvider {

	private AnnotationConfigApplicationContext annotationContext;
	private AutoWireBean autoWireBean;
	
	public AutoWireBean getAutoContext() {
		
		annotationContext = new AnnotationConfigApplicationContext(AnnotationConfigurationProvider.class);
		
		autoWireBean = (AutoWireBean)annotationContext.getBean(AutoWireBean.class);
		return autoWireBean;
	}
	
}
