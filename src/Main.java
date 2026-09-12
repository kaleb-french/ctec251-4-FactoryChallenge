public class Main {
    static void main() {
        EnemySpawner fs = new ForestSpawner();
        EnemySpawner ds = new DungeonSpawner();
        Enemy skelly = ds.createEnemy("skeleton");
        Enemy slimey = ds.createEnemy("slime");
        Enemy wolfy = fs.createEnemy("wolf");
        Enemy gobby = fs.createEnemy("goblin");

        skelly.attack();
        gobby.attack();
        slimey.attack();
        wolfy.attack();
    }
}
