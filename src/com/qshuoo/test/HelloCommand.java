package com.qshuoo.test;

public class HelloCommand implements Command{
	private HelloSubject subject;
	

	public HelloCommand(HelloSubject subject) {
		super();
		this.subject = subject;
	}


	@Override
	public void excute() {
		// TODO Auto-generated method stub
		subject.setHello("Hello World!");
		
	}

}
