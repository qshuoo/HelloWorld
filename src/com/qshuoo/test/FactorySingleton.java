package com.qshuoo.test;

public class FactorySingleton {
	private static FactorySingleton instance = null;
	private Factory factory;
	private FactorySingleton() {
		factory = new HelloFactory();
	}
	
	public static synchronized FactorySingleton getInstance() {
		if (instance == null) {
            instance = new FactorySingleton();
        }
        return instance;
	}
	
	public Factory getFactory() {
		return factory;
	}

}
