package Character.Melee;
import Character.Character;

public class Barbarian extends Melee {

    private double damageMultiplier;

    public Barbarian(String name, double health, WeaponType weaponType, double damageMultiplier) {
        super(name, health, weaponType);
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
