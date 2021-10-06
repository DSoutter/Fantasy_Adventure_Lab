package Character.Melee;
import Character.Character;

public class Barbarian extends Character {

    private double damageMultiplier;

    public Barbarian(String name, double health, double damageMultiplier) {
        super(name, health);
        this.damageMultiplier = damageMultiplier;
    }

    public double getDamageMultiplier() {
        return damageMultiplier;
    }

    public void changeItem() {

    }

    public void changeHealth() {

    }
}
