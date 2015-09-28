package org.javainterviewprep.examples.abstractvsinterface;

/*
 * Q1. What is abstract class ?
 * A class is declared ABSTRACT when one or more of its method is defined abstract.
 * ABSTRACT methods are those which are just defined and not provided any implementation.
 * ABSTRACT class have methods with implementation also.
 * ABSTRACT class can never be instantiated, its main purpose is to get extended.
 * Sub-Classes of an ABSTRACT Class need to provide concrete implementation to ABSTRACT methods.
 * 
 * Q2. What is an interface ?
 * An interface is not a class, it is guideline of behaviors which need to be followed if a Class want 
 * to implement a certain type of functionality.
 * All the methods of an interface are default public and Abstract.
 */

//BluePrintCar cannot be instantiated
//BluePrintCar always give "Java Car & Co." as the defined by entity.
//BluePrintCar tells it's concrete implementation to give a carName.
//BluePrintCar tells it's concrete implementation to give a launchSeason
public abstract class BluePrintCar {

	public String bluePrintDefinedBy()
	{
		return "Java Car & Co.";
	}
	
	public abstract String carName();
	
	public abstract String launchSeason();
	
}
