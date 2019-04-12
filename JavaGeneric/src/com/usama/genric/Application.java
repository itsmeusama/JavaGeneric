package com.usama.genric;

public class Application {

	public static void main(String[] args) {
		/*Car car = new Car();
		Jeep jeep = new Jeep();
		
		Vehicle <car> carVehicle = new Vehicle<>(car);
		carVehicle.drive();
		
		Vehicle <jeep> jeepVehicle = new Vehicle<>(jeep);
		jeepVehicle.drive();*/
		
		
		Integer num[]= {1,2,3,4,5,6,7};
		String s[]= {"a","e","i","o","u"};
		
		
		PrintArray print =new PrintArray();
		print.printArray(num);
		print.printArray(s);
		

	}

}
