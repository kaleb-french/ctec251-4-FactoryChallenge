public class Wolf extends Enemy{

	Wolf(EquipmentFactory ef) {
		super(ef);
	}

	@Override
	public void attack() {
	System.out.println("Wolf slashes with its " + this.weapon.getDescription() + " while wearing " + this.armor.getDescription());
	}


}
