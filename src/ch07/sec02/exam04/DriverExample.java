package ch07.sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver drive = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		
		drive.drive(bus);
		drive.drive(taxi);
	}

}
