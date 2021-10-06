package Character.Melee;
import Character.Character;

public abstract class Melee extends Character {

    protected WeaponType weaponType;

    public Melee(String name, double health, WeaponType weaponType) {
        super(name, health);
        this.weaponType = weaponType;
    }

    public double getWeaponDamage(){
        return this.weaponType.getDamage();
    }

    public void changeItem() {

    }

    public void changeHealth() {

    }
}
