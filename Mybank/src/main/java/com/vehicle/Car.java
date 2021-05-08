package com.vehicle;
public class Car {
	Engine e ;
	String model;
	String owner;
	
	public Car(Engine e) {
		super();
		this.e = e;
		System.out.println("Car(Engine) const is called...");
	}

	public Car() {
		super();
		System.out.println("Car() const is called...");
	}
	public void startCar() {
		if(e!=null) {
		e.startEngine();}
		System.out.println(owner+" is Starting "+model+" Car... ");
		
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
