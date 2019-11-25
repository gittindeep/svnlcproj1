import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the weight");
		double wt = s.nextDouble();
		System.out.println("Enter the distance");
		double dt = s.nextDouble();
		System.out.println("Enter the mode");
		String mo = s.next();
		ShipmentBO shipmentBO = new ShipmentBO();
		double charge = shipmentBO.calculateShippingCharge(wt, dt, mo);
		System.out.printf("Shipment Cost : %.2f", charge);
	}

}