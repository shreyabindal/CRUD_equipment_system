package equipment_system;

public class Equipment {
	protected String Name;
	protected String description;
	protected int distanceMoveTillDate;
	protected int maintainanceCost;

	public Equipment() {
		this.Name = "";
		this.description = "";
		this.distanceMoveTillDate = 0;
		this.maintainanceCost = 0;
	}

	public Equipment(String Name, String description, int distanceMovedTillDate, int maintainanceCost) {
		this.Name = Name;
		this.description = description;
		this.distanceMoveTillDate = distanceMovedTillDate;
		this.maintainanceCost = maintainanceCost;
	}

	public void MoveBy(int distanceMoved, int x) {
		this.maintainanceCost += distanceMoved * x;
	}

	public String getName() {
		return this.Name;
	}

	public String getDespription() {
		return this.description;
	}

	public int getDistanceTillDate() {
		return this.distanceMoveTillDate;
	}

	public int getMaintainaceCost() {
		return this.maintainanceCost;
	}

}
