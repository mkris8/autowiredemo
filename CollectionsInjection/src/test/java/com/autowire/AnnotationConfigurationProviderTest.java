package com.autowire;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnnotationConfigurationProviderTest {

	private AnnotationConfigurationProvider annotationConfigurationProvider;
	private AutoWireBean autoAutoWireBean;
	private AnnotationContextProvider annotationContextProvider;
	@Before
	public void init(){
		annotationConfigurationProvider = new AnnotationConfigurationProvider();
		annotationContextProvider = new AnnotationContextProvider();
		annotationContextProvider.getAutoContext();
	}
	
	@Test
	public void testAutoWireBeanNotNUll(){
		autoAutoWireBean = (AutoWireBean)annotationContextProvider.getAutoContext();
		Assert.assertNotNull(autoAutoWireBean);
		Assert.assertEquals("testmessage", autoAutoWireBean.getMessage());
	}

}
