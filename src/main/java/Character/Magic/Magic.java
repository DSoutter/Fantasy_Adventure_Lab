package Character.Magic;
import Character.Character;

import java.util.ArrayList;


public abstract class Magic extends Character {

    private ArrayList<Spells> spells;
    private Creature creature;

    public Magic(String name, double health, Spells spells, Creature creature) {
        super(name, health);
        this.spells = new ArrayList<>();
        this.creature = creature;
    }

    public ArrayList<Spells> getSpells() {
        return spells;
    }

    public double getSpellDamage(int index){
        return spells.get(index).getDamage();
    }

    public double getCreatureHealth() {
        return creature.getHealth();
    }
}
