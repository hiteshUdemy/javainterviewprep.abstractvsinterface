package org.javainterviewprep.examples.abstractvsinterface;

public class CarTest {
	
	public static void main(String[] args) {
		ConcreteCar car = new ConcreteCar();
		
		System.out.println("Design Defined by " + car.bluePrintDefinedBy() + " made car with name " + car.carName() + " launching on"
				+ car.launchSeason());
		
		System.out.println("Demo GPS Functioning " + car.startGPS() + " -> " + car.provideRoute() + " -> " + car.stopGPS());
	}
}
