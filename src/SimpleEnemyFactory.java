public class SimpleEnemyFactory {

    public Enemy createEnemy(String type){
        Enemy enemy;
        switch (type){
            case "skelton":
                enemy = new Skeleton();
                break;
            case "goblin":
                enemy = new Goblin();
                break;
            default:
                enemy = new Skeleton();
                break;
        }
        return enemy;
    }
}
