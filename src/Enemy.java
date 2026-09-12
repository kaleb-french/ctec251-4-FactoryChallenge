public abstract class Enemy{
    //a
    protected Armor armor;
    protected Weapon weapon;
    //c
    Enemy(EquipmentFactory ef){
        this.armor = ef.createArmor();
        this.weapon = ef.createWeapon();
    }
    //m
    public abstract void attack();
}
