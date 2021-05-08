package com.vehicle;
public class Car {
	Engine e ;
	
	public Car(Engine e) {
		super();
		this.e = e;
		System.out.println("Car() const is called...");
	}

	public void startCar() {
		e.startEngine();
		System.out.println("Starting Car...");
		
		
	}
	
}
