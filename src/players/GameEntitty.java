package players;

public abstract class GameEntitty {
    private int health;
    private int damage;
    public GameEntitty (int health, int damage){
        this.health=health;
        this.damage = damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }




    }
}
