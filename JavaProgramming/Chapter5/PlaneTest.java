package chapter5;

import java.util.ArrayList;

class Plane {
	private String airline, modelName, passenger;
	
	void setAirline(String airline) {
		this.airline = airline;
	}
	String getAirline() {
		return airline;
	}
	void setModelName(String modelName) {
		this.modelName = modelName;
	}
	String getModelName() {
		return modelName;
	}
	void setPassenger(String passenger) {
		this.passenger = passenger;
	}
	String getPassenger() {
		return passenger;
	}
	Plane(String airline, String modelName, String passenger) {
		this.airline = airline;
		this.modelName = modelName;
		this.passenger = passenger;
	}
	Plane() {
		this("", "", "");
	}
}

public class PlaneTest {
	public static void main(String[] args) {
		ArrayList<Plane> list = new ArrayList<Plane>();
		list.add(new Plane("1", "aa", "200"));
		list.add(new Plane("2", "bb", "300"));
		list.add(new Plane("3", "cc", "150"));
		
		for(Plane obj: list) {
			System.out.printf("½Äº°¹øÈ£: %s ¸ðµ¨ %s ½Â°´¼ö %s\n", 
					obj.getAirline(), obj.getModelName(), obj.getPassenger());
		}
	}
}
