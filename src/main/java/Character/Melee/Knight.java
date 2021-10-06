package Character.Melee;
import Character.Character;

public class Knight extends Melee{

    private double armour;

    public Knight(String name, double health, WeaponType weaponType, double armour) {
        super(name, health, weaponType);
        this.armour = armour;
    }

    public double getArmour() {
        return armour;
    }

    public void changeItem() {

    }

    public void changeHealth() {

    }
}
