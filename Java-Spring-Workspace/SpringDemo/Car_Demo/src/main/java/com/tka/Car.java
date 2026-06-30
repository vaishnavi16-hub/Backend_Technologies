package com.tka;

public class Car {

	
	private int carId;
	private String carName;
	private Engine engine;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Car(int carId, String carName, Engine engine) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", engine=" + engine + "]";
	}
	
	
	
}
