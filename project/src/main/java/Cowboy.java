public class Cowboy extends Element{
    Health health;
    int coinsCollected;
    public Cowboy(Position pos, Health h) {
        super(pos);
        health = h;
        coinsCollected = 0;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public int getCoinsCollected() {
        return coinsCollected;
    }

    public void setCoinsCollected(int coinsCollected) {
        this.coinsCollected = coinsCollected;
    }
}