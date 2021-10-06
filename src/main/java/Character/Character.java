package Character;

public abstract class Character implements IChangeable, IHealthModifier {

    private String name;
    private double health;

    public Character(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void healthIncrease(double amount){
        this.health += amount;
    }

    public void healthDecrease(double health) {
        this.health -= health;
    }
}
