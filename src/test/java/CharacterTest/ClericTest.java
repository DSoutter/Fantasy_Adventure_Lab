package CharacterTest;

import Character.Cleric.Cleric;
import Character.Cleric.HealingTools;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    ArrayList<HealingTools> healingTools;
    Cleric cleric;

    @Before
    public void before(){
        healingTools = new ArrayList<>();
        healingTools.add(HealingTools.SUPERPOTION);
        cleric = new Cleric("Sarah", 400.00, healingTools);
    }

    @Test
    public void clericHasHealingTool(){
        assertEquals(1, cleric.getHealingToolsArrayList().size());
    }

    @Test
    public void clericCanHeal(){
        cleric.changeHealth(cleric, 0);
        assertEquals(600.00, cleric.getHealth(),0.01);
    }
}
