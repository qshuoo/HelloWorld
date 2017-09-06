package com.qshuoo.test;

import java.util.ArrayList;
import java.util.Iterator;

public class HelloSubject implements Subject {
	
	private ArrayList<Observer> observers;
	
	private String hello;

	
	public HelloSubject() {
		observers = new ArrayList<>();
	}


	@Override
	public void order(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}


	@Override
	public void cancel(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}


	@Override
	public void notifyOb() {
		// TODO Auto-generated method stub
		Iterator<Observer> iter = observers.iterator();
		while(iter.hasNext()) {
			Observer observer = iter.next();
			observer.update(this);
		}
		
	}


	public String getHello() {
		return hello;
	}


	public void setHello(String hello) {
		this.hello = hello;
		notifyOb();
	}


}
