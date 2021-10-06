package Character.Magic;

public enum Creature {

    TROLL(200.0),
    ORC(150.0),
    DRAGON(50000.0);

    final double health;


    Creature(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }
}
