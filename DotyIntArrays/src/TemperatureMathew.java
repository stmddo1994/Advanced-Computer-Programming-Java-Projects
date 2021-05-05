/*
File: TemperatureMathew.java
Project: CSIS3101 Assignment 8
Author:  Mathew Doty 
History: Version 1.3 March 11, 2021
 */
public class TemperatureMathew {
	
	//Private variables
	private double temperature;
	private String unit;
	
	//Constructors
	TemperatureMathew(){
		temperature = 0.0;
		unit = "F";
	}
	
	TemperatureMathew(double temp, String u){
		this.temperature = temp;
		this.unit = u;
	}
	
	//get Temperature values and change based on unit
	public void setFTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void setCTemperature(double temperature) {
		this.temperature = (temperature - 32) * (double)5.0/9.0;
	}
	
	public void setKTemperature(double temperature) {
		this.temperature = (temperature - 32) * (double)5.0/9.0 + 273.15;
	}
	
	public double getFTemperature() {
		return temperature;
	}
	
	public double getCTemperature() {
		return (temperature - 32) * (double)5.0/9.0;
	}
	
	public double getKTemperature() {
		return (temperature - 32) * (5.0/9.0) + 273.15;
	}
	
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}


}
