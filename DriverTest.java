package day05;

interface Vehicle{
	public void run();
}
class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
class Taxi implements Vehicle{
	@Override
	public void run() {		
	}
	
}
class Driver{
	//다형성..
	void drive(Vehicle vehicle) {
		System.out.println("운전자...");
		vehicle.run();
	}
}
}
public class DriverTest {
	

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		driver.drive(bus);
		Taxi taxi = new Taxi();
		driver.drive(taxi);

	}

}
