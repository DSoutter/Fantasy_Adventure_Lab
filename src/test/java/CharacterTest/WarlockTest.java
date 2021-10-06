package CharacterTest;

import Character.Magic.Creature;
import Character.Magic.Spells;
import Character.Magic.Warlock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    ArrayList<Spells> spells;

    @Before
    public void before(){
        spells = new ArrayList<>();
        spells.add(Spells.FIREBALL);
        warlock = new Warlock("Jeremy", 200.00, spells, Creature.DRAGON);
    }

    @Test
    public void warlockHasSpells(){
        assertEquals(1, spells.size());
    }

    @Test
    public void warlockHasDragon(){
        assertEquals(50000.00, warlock.getCreatureHealth(), 0.01);
    }
}
