package org.javainterviewprep.examples.abstractvsinterface;

//ConcreteCar should inspire design from BluePrintCar.
//ConcreteCar have name "JavaCar".
//ConcreteCar is launching in Winter Season.
//ConcreteCar should provide GPS functioning as stated by GPCCapability.
public class ConcreteCar extends BluePrintCar implements GPSCapability {

	@Override
	public String startGPS() {
		return "Starting GPS";
	}

	@Override
	public String provideRoute() {
		// TODO Auto-generated method stub
		return "Calculating Route";
	}

	@Override
	public String stopGPS() {
		// TODO Auto-generated method stub
		return "Stopping GPS";
	}

	@Override
	public String carName() {
		// TODO Auto-generated method stub
		return "Java Car";
	}

	@Override
	public String launchSeason() {
		// TODO Auto-generated method stub
		return "Winter";
	}
	
}
