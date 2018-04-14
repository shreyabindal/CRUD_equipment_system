package equipment_system;

import java.util.ArrayList;

public class Mobile extends Equipment {
	private int noOfWheels;
	public static ArrayList<Mobile> mobiles = new ArrayList<>();

	public int getNoOfWheels() {
		return this.noOfWheels;
	}

	public Mobile() {
		super();
		this.noOfWheels = 0;
	}

	public Mobile(String Name, String description, int distanceMovedTillDate, int maintainanceCost, int noOfWheels) {
		super(Name, description, distanceMovedTillDate, maintainanceCost);
		this.noOfWheels = noOfWheels;
		mobiles.add(this);
	}

	public void MoveBy(int distanceMoved) {
		super.MoveBy(distanceMoved, this.noOfWheels);
	}

	@Override
	public String toString() {
		return "Name : " + this.Name + "\nDescription : " + this.description + "\nDistance Moved Till Date : "
				+ this.distanceMoveTillDate + "\nMaintainance Cost : " + this.maintainanceCost + "\nNo Of Wheels : "
				+ this.noOfWheels + "\n********************";
	}
}