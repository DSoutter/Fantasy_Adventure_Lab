package Character.Melee;
import Character.Character;

public class Knight extends Character{

    private double armour;

    public Knight(String name, double health, double armour) {
        super(name, health);
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
