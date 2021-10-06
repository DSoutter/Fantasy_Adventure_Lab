package CharacterTest;

import Character.Melee.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Thor", 200.00, 1.25);
    }

    @Test
    public void babaHasDamageMultiplier(){
        assertEquals(1.25, barbarian.getDamageMultiplier(), 0.01);
    }
}
