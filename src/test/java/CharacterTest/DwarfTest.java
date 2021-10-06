package CharacterTest;

import Character.Melee.Dwarf;
import Character.Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Bert", 200.00, WeaponType.AXE, 0.8);

    }

    @Test
    public void dwarfHasName(){
        assertEquals("Bert", dwarf.getName());
    }

    @Test
    public void dwarfHasHP(){
        assertEquals(200.00, dwarf.getHealth(), 0.01);
    }

    @Test
    public void dwarfHasHitChance(){
        assertEquals(0.8, dwarf.getHitChance(),0.01);
    }
}
