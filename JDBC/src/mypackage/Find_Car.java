package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Find_Car {

	public static void main(String[] args) {
		
		Car car1=new Car("100", "i10", "hyundai");
		Car car2=new Car("800", "Alto", "Maruti");
		Car car3=new Car("300", "verna", "Hyundai");
		Car car4=new Car("600", "Amaze", "Honda");
		
		Showroom showroom=new Showroom();
		showroom.setCarName("SHOWROOM");

		HashMap<String, Car> cars=new HashMap<>();

		cars.put(car1.modelNo,car1);
		cars.put(car2.modelNo,car2);
		cars.put(car3.modelNo,car3);
		cars.put(car4.modelNo,car4);
		// TODO Auto-generated method stub
		
		showroom.setCars(cars);
		
		HashMap<String, Car> showroom_Cars=(HashMap<String, Car>)showroom.getCars();
		System.out.println(showroom_Cars.get("100"));

	}

}
