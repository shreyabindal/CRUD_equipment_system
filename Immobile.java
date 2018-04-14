package equipment_system;

import java.util.ArrayList;

public class Immobile extends Equipment {
	private int weight;
	public static ArrayList<Immobile> immobiles = new ArrayList<>();

	public int getWeight() {
		return this.weight;
	}

	public Immobile() {
		super();
		this.weight = 0;
		immobiles.add(this);
	}

	public Immobile(String Name, String description, int distanceMovedTillDate, int maintainanceCost, int weight) {
		super(Name, description, distanceMovedTillDate, maintainanceCost);
		this.weight = weight;
		immobiles.add(this);
	}

	public void MoveBy(int distanceMoved) {
		super.MoveBy(distanceMoved, this.weight);
	}

	@Override
	public String toString() {
		return "Name : " + this.Name + "\nDescription : " + this.description + "\nDistance Moved Till Date : "
				+ this.distanceMoveTillDate + "\nMaintainance Cost : " + this.maintainanceCost + "\nWeight : "
				+ this.weight + "\n********************";
	}
}
