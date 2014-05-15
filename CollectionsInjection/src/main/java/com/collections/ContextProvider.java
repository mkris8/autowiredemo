package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beans.Person;

public class ContextProvider {

	private ApplicationContext context;
	private Person person;
	private CollectionsInjector collectionsInjector;

	public void setCollectionsInjector(CollectionsInjector collectionsInjector) {
		this.collectionsInjector = collectionsInjector;
	}

	public void loadApplicationContext() {

		context = new FileSystemXmlApplicationContext("spring-beans.xml");
	}

	public Person getPersonFromContext() {
		loadApplicationContext();
		person = (Person) context.getBean(Person.class);
		return person;
	}

	public CollectionsInjector getCollectionsInjector() {
		loadApplicationContext();
		collectionsInjector = (CollectionsInjector) context.getBean(CollectionsInjector.class);
		return collectionsInjector;
	}
}
