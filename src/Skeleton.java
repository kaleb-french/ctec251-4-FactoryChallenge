public class Skeleton extends Enemy{

	Skeleton(EquipmentFactory ef) {
		super(ef);
	}

	@Override
	public void attack() {
	System.out.println("Skeleton rattles its bones and attacks with" + this.weapon.getDescription() + " while wearing " + this.armor.getDescription());
	}


}
