package com.qshuoo.test;

public class Client {
	public static void main(String[] args) {
		
		Factory factory = FactorySingleton.getInstance().getFactory();
		Subject subject= factory.createSubject();
		subject.order(factory.createObserver());
		Command command = factory.createCommand((HelloSubject)subject);
		command.excute();
		
	}

}
