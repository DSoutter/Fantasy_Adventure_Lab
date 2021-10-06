package CharacterTest;

import Character.Melee.Knight;
import Character.Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Sofia", 300.00, WeaponType.BATTLEAXE, 100.00);
    }

    @Test
    public void knightHasArmour(){
        assertEquals(100.00, knight.getArmour(),0.01);
    }
}
