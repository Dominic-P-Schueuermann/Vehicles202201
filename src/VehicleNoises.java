import model.Car;	
import model.Jeep;
import model.Moped;
import model.MuscleCar;
import model.Bus;
import model.Train;
import model.Truck;
import model.ElectricCar;
import model.boat;
import model.ElectricTruck;
import model.Motorcycle;
import model.Helicopter;
import model.bulletTrain;
import model.bike;
import model.heelys;


public class VehicleNoises {
	// add your vehicle class to the model package
	// only push this file and the vehicle class you created
	public model bulletTrain;
	public model bike;
	public model heelys;

	public String makeNoise(){

		String noise= "Honk";

		return noise;
	}


	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		Jeep jeep = new Jeep();
		System.out.println(jeep.makeNoise());
		
		Bus bus = new Bus();
		System.out.println(bus.makeNoise());
		
		Train train = new Train();
		System.out.println(train.makeNoise());

		Truck truck = new Truck();
		System.out.println(truck.makeNoise());
		
		ElectricCar EC = new ElectricCar();
		System.out.println(EC.makeNoise());

		boat nboat = new boat();
		System.out.println(nboat.makeNoise());
		
		Moped moped = new Moped();
		System.out.println(moped.makeNoise());

		ElectricTruck ET= new ElectricTruck();
		System.out.println(ET.makeNoise());

		Motorcycle motorcycle = new Motorcycle();
		System.out.println(motorcycle.makeNoise());

		MuscleCar MC = new MuscleCar();
		System.out.println(MC.makeNoise());
		
		Helicopter chopper = new Helicopter();
		System.out.println(chopper.makeNoise());

		bulletTrain bt = new bulletTrain();
		System.out.println(bt.makeNoise());

		bike bicicle = new bike();
		System.out.println(bicicle.makeNoise());

		heelys shoesWithWheels = new heelys();
		System.out.println(shoesWithWheels.makeNoise());








	}

}
