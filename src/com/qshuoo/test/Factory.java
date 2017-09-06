package com.qshuoo.test;

public interface Factory {
	public Subject createSubject();
	public Observer createObserver();
	public Command createCommand(HelloSubject subject);

}
