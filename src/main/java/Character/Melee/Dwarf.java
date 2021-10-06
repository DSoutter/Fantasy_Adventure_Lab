package Character.Melee;
import Character.Character;

public class Dwarf extends Character {

    private double hitChance;

    public Dwarf(String name, double health, double hitChance) {
        super(name, health);
        this.hitChance = hitChance;
    }

    public double getHitChance() {
        return hitChance;
    }

    public void changeItem() {

    }

    public void changeHealth() {

    }
}
