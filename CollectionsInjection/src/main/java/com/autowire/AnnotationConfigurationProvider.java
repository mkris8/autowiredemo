package com.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfigurationProvider {

	private AutoWireBean autoWireBean;
	
	@Bean
	public AutoWireBean getAutoWireBean() {
		autoWireBean = new AutoWireBean();
		autoWireBean.setMessage("testmessage");
		return this.autoWireBean;
	}

	
}
