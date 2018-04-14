package client_side;

import equipment_system.Equipment;
import equipment_system.Immobile;
import equipment_system.Mobile;

public class Client {

	public static void main(String[] args) {
		Mobile m = new Mobile("Jeep", "Moves on road", 50, 100, 4);
		showAnEquipment(m);
		m.MoveBy(5, m.getNoOfWheels());
		showAnEquipment(m);

		Immobile im = new Immobile("Ladder", "Very useful", 60, 200, 50);
		showAnEquipment(im);
		im.MoveBy(5, im.getWeight());
		showAnEquipment(im);

		listAllEquipments();
		deleteAnEquipment(m);
		listAllEquipments();
	}

	public static void listAllEquipments() {
		System.out.println("Mobile Equipments are => ");
		for (Mobile m : Mobile.mobiles) {
			System.out.println(m);
		}
		System.out.println("Immobile Equipments are => ");
		for (Immobile im : Immobile.immobiles) {
			System.out.println(im);
		}
	}

	public static void showAnEquipment(Equipment eq) {
		System.out.println(eq);
	}

	public static void deleteAnEquipment(Equipment eq) {
		if (Mobile.mobiles.contains(eq)) {
			Mobile.mobiles.remove(eq);
		} else if (Immobile.immobiles.contains(eq)) {
			Immobile.immobiles.remove(eq);
		}
		eq = null;
	}
}
