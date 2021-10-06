package Character.Melee;
import Character.Character;

public class Melee extends Character {

    private WeaponType weaponType;

    public Melee(String name, double health, WeaponType weaponType) {
        super(name, health);
        this.weaponType = weaponType;
    }

    public void changeItem() {

    }

    public void changeHealth() {

    }
}
