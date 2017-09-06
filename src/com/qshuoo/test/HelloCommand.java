package com.qshuoo.test;

public class HelloCommand implements Command{
	private HelloSubject subject;
	

	public HelloCommand(Subject subject) {
		super();
		this.subject = (HelloSubject)subject;
	}


	@Override
	public void excute() {
		// TODO Auto-generated method stub
		subject.setHello("Hello World!");
		
	}

}
