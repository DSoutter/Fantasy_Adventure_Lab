package Character.Cleric;
import Character.Character;

import java.util.ArrayList;


public class Cleric extends Character {

    private ArrayList<HealingTools> healingToolsArrayList;

    public Cleric(String name, double health, ArrayList<HealingTools> healingToolsArrayList) {
        super(name, health);
        this.healingToolsArrayList = healingToolsArrayList;
    }

    public ArrayList<HealingTools> getHealingToolsArrayList() {
        return healingToolsArrayList;
    }

    public void changeItem() {

    }

    public void changeHealth(Character character, int amount) {
        character.healthIncrease(healingToolsArrayList.get(amount).healthValue);
    }

}
