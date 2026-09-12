public class DungeonSpawner extends EnemySpawner{

    @Override
	protected Enemy createEnemy(String type){
	    Enemy enemy;
        switch (type){
            case "skeleton":
                enemy = new Skeleton(new WarriorEquipmentFactory());
                break;
            case "slime":
                enemy = new Slime(new MagicEquipmentFactory());
                break;
            default:
                enemy = new Slime(new WarriorEquipmentFactory());
                break;
            }
        return enemy;
	}
}
