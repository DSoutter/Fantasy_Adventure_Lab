package Character.Magic;
import Character.Character;

import java.util.ArrayList;


public abstract class Magic extends Character {

    private ArrayList<Spells> spellsArrayList;
    private Creature creature;

    public Magic(String name, double health, ArrayList<Spells> spellsArrayList, Creature creature) {
        super(name, health);
        this.spellsArrayList = spellsArrayList;
        this.creature = creature;
    }

    public ArrayList<Spells> getSpells() {
        return spellsArrayList;
    }

    public double getSpellDamage(int index){
        return spellsArrayList.get(index).getDamage();
    }

    public double getCreatureHealth() {
        return creature.getHealth();
    }

    public void changeHealth(Character character, int amount){

    }
}
