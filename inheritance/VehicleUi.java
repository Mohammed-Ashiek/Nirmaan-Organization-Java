package inheritance;

public class VehicleUi {
public static void main(String[] args) {
	Vehicle v= new Vehicle();
	ElectricCar ev =new ElectricCar();
	Bike b= new Bike();
	v.startEngine();
	ev.drive();
	ev.ChargeBattery();
	v.startEngine();
	b.kickStart();
	
}
}
