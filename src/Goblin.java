public class Goblin extends Enemy{

	Goblin(EquipmentFactory ef) {
		super(ef);
	}

	@Override
	public void attack() {
	System.out.println("Goblin slashes with a" + this.weapon.getDescription() + " while wearing " + this.armor.getDescription());
	}


}
