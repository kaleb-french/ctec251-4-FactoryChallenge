public class Slime extends Enemy{

	Slime(EquipmentFactory ef) {
		super(ef);
	}

	@Override
	public void attack() {
	System.out.println("Slime lunges with its " + this.weapon.getDescription() + " wearing a " + this.armor.getDescription());
	}


}
