package com.vehicle;
public class Engine {
	Piston p;
	
	public Engine(Piston p) {
		super();
		this.p = p;
		System.out.println("Engine() costis called...");
	}

	public void startEngine() {
		p.firePiston();
		System.out.println("Engine is Starting...");
		
		
	}
	
}
