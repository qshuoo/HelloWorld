package com.qshuoo.test;

public interface Subject {
	public void order(Observer observer);
	public void cancel(Observer observer);
	public void notifyOb();

}
