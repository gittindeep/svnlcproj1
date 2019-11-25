public class ShipmentBO {

	public double calculateShippingCharge(double wt, double dt, String mo) {
		double charge = 0.0;
		if (mo.equals("Road")) {
			charge = (wt * 0.02) + (dt * 0.04);
		} else if (mo.equals("Sea")) {
			charge = (wt * 0.02) + (dt * 0.06);
			charge = charge * 1.02;
		} else if (mo.equals("Air")) {
			charge = (wt * 0.02) + (dt * 0.1);
			charge = charge + 300;
		}
		return charge;
	}
}
