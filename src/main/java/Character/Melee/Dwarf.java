package Character.Melee;
import Character.Character;

public class Dwarf extends Melee {

    private double hitChance;

    public Dwarf(String name, double health, WeaponType weaponType, double hitChance) {
        super(name, health, weaponType);
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
