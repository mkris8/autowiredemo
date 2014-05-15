package com.collections;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.beans.Person;

public class ContextProviderTest {

	private ContextProvider contextProvider;
	private Person person;
	private CollectionsInjector injector;

	@Before
	public void init() {
		contextProvider = new ContextProvider();
		contextProvider.loadApplicationContext();
		injector = contextProvider.getCollectionsInjector();
	}

	@Test
	public void testPersonIsNOtNULL() {
		person = contextProvider.getPersonFromContext();
		Assert.assertNotNull(person);
	}

	@Test
	public void testCollectionsListtNotNULL() {
		Assert.assertNotNull(injector);
	}

	@Test
	public void testCollectionsListValues() {
		Assert.assertEquals("val1", injector.getTestList().get(0));
	}

	@Test
	public void testCollectionsSetNotNULL() {
		Assert.assertNotNull(injector.getTestSet());
	}

	@Test
	public void testCollectionsSetValues() {
		Assert.assertEquals(2, injector.getTestSet().size());
	}

	@Test
	public void testCollectionsMapNotNULL() {
		Assert.assertNotNull(injector.getTestMap());
	}

	@Test
	public void testCollectionsMapValues() {
		Map<String, String> map = injector.getTestMap();
		for (String key : map.keySet()) {
			Assert.assertEquals("val1", map.get(key));
			break;
		}
	}

}
