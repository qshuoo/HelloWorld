package com.qshuoo.test;

public class HelloFactory implements Factory {

	@Override
	public Subject createSubject() {
		// TODO Auto-generated method stub
		return new HelloSubject();
	}

	@Override
	public Observer createObserver() {
		// TODO Auto-generated method stub
		return new HelloObserver();
	}

	@Override
	public Command createCommand(HelloSubject subject) {
		// TODO Auto-generated method stub
		return new HelloCommand(subject);
	}

}
