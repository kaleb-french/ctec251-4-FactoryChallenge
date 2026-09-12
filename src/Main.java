public class Main {
    static void main() {
        SimpleEnemyFactory sef = new SimpleEnemyFactory();
        Enemy skelly = sef.createEnemy("skeleton");
        Enemy gobby = sef.createEnemy("goblin");

        skelly.attack();
        gobby.attack();
    }
}
