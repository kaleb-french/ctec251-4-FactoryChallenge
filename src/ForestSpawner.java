public class ForestSpawner extends EnemySpawner{

	@Override
	protected Enemy createEnemy(String type){
        Enemy enemy;
        switch (type){
            case "wolf":
                enemy = new Wolf(new WarriorEquipmentFactory());
                break;
            case "goblin":
                enemy = new Goblin(new MagicEquipmentFactory());
                break;
            default:
                enemy = new Wolf(new MagicEquipmentFactory());
                break;
            }
        return enemy;
	}

}
