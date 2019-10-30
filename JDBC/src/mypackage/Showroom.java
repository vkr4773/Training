package mypackage;

import java.util.ArrayList;
import java.util.Map;

public class Showroom {
	String carName;
	Map<String,Car> cars;
	public String getLibName() {
	return carName;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	

}
