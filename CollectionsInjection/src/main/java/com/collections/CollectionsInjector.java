package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsInjector {

	private List<String> testList;
	private Set<String> testSet;
	private Map<String, String> testMap;

	public Map<String, String> getTestMap() {
		return testMap;
	}

	public void setTestMap(Map<String, String> testMap) {
		this.testMap = testMap;
	}

	public Set<String> getTestSet() {
		return testSet;
	}

	public void setTestSet(Set<String> testSet) {
		this.testSet = testSet;
	}

	public List<String> getTestList() {
		return testList;
	}

	public void setTestList(List<String> testList) {
		this.testList = testList;
	}

	@Override
	public String toString() {
		return "CollectionsInjector [testList=" + testList + ", testSet="
				+ testSet + ", testMap=" + testMap + "]";
	}

}
