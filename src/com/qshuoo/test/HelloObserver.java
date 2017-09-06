package com.qshuoo.test;

public class HelloObserver implements Observer{
	
	private HelloSubject hs;

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		hs = (HelloSubject)subject;
		System.out.println(hs.getHello());
		
	}

}
