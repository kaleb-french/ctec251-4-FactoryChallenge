public class Main {
    static void main() {
//        EnemySpawner fs = new ForestSpawner();
//        EnemySpawner ds = new DungeonSpawner();
        Skeleton skelly = new Skeleton(new WarriorEquipmentFactory());
        Slime slimey = new Slime(new MagicEquipmentFactory());
        Wolf wolfy = new Wolf(new WarriorEquipmentFactory());
        Goblin gobby = new Goblin(new MagicEquipmentFactory());

        skelly.attack();
        gobby.attack();
        slimey.attack();
        wolfy.attack();
    }
}
