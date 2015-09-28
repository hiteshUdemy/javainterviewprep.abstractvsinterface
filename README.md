# javainterviewprep.abstractvsinterface
##Exercise 1 - Define a BluePrint of Pointing Device made by "Java Pointing Devices"
###Section A
* Create an Abstrac Class PointingDeviceBluePrint
* Design Defined by should return "Java Pointing Devices"
* Should tell the concrete class to implement pointingDeviceName
* Should tell the concrete class to implement pointingDeviceType
* Should tell the concrete class to implement leftMouseClick
* Should tell the concrete class to implement rightMouseClick

###Section B
* Create an Interface OpticalCapabilities
* Should define screenScrolling
* Should define getScreenCoordinates

###Section C
* Create a concrete Class OptiocalMouse which extends PointingDeviceBluePrint and implements OpticalCapabilities
* pointingDeviceName returns "Java Optical Mouse"
* pointingDeviceType returns "External Wireless Mouse"
* leftMouseClick returns "Action Performed"
* rightMouseClick returns "List of Actions"
* screenScrolling returns "traversing screen"
* getScreenCoordinates returns "x = 10, y =50"
