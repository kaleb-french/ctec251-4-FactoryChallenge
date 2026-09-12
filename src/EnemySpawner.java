public abstract class EnemySpawner{

    protected abstract Enemy createEnemy(String type);

    public Enemy spawnEnemy(String type){
        System.out.println("Spawning enemy " + type);
        Enemy enemy = createEnemy(type);
        return enemy;
    }
}
