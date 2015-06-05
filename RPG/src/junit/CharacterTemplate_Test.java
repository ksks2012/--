package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import basic.data.CharacterTemplate;

public class CharacterTemplate_Test {

    public CharacterTemplate_Test() {
        ;
    }

    /**
     * constructor.
     */
    @Test
    public void constructor_test() {
        CharacterTemplate zeroInput_Character = new CharacterTemplate();
        
        System.out.println(zeroInput_Character.getName());
        assertEquals("Name: null", zeroInput_Character.getName());

        System.out.println(zeroInput_Character.getHP());
        assertEquals("HP: 0.0", zeroInput_Character.getHP());

        System.out.println(zeroInput_Character.getMP());
        assertEquals("MP: 0.0", zeroInput_Character.getMP());

        System.out.println(zeroInput_Character.getATK());
        assertEquals("ATK: 0.0", zeroInput_Character.getATK());

        System.out.println(zeroInput_Character.getDEF());
        assertEquals("DEF: 0.0", zeroInput_Character.getDEF());

        System.out.println(zeroInput_Character.getMove());
        assertEquals(0, zeroInput_Character.getMove());

        System.out.println(zeroInput_Character.getCamp());
        assertEquals(0, zeroInput_Character.getCamp());
        
        
        CharacterTemplate multiInput_Character = new CharacterTemplate(9,8,7,6,"HAHA");
        
        System.out.println(multiInput_Character.getName());
        assertEquals("Name: HAHA", multiInput_Character.getName());

        System.out.println(multiInput_Character.getHP());
        assertEquals("HP: 9.0", multiInput_Character.getHP());

        System.out.println(multiInput_Character.getMP());
        assertEquals("MP: 8.0", multiInput_Character.getMP());

        System.out.println(multiInput_Character.getATK());
        assertEquals("ATK: 7.0", multiInput_Character.getATK());

        System.out.println(multiInput_Character.getDEF());
        assertEquals("DEF: 6.0", multiInput_Character.getDEF());

        System.out.println(multiInput_Character.getMove());
        assertEquals(0, multiInput_Character.getMove());

        System.out.println(multiInput_Character.getCamp());
        assertEquals(0, multiInput_Character.getCamp());
    }

    /**
     * Setter.
     */
    @Test
    public void setter() {
        CharacterTemplate character = new CharacterTemplate();

        character.setName("ADAD");
        System.out.println(character.getName());
        assertEquals("Name: ADAD", character.getName());

        character.setHP(0);
        System.out.println(character.getHP());
        assertEquals("HP: 0.0", character.getHP());

        character.setMP(1);
        System.out.println(character.getMP());
        assertEquals("MP: 1.0", character.getMP());

        character.setATK(2);
        System.out.println(character.getATK());
        assertEquals("ATK: 2.0", character.getATK());

        character.setDEF(3);
        System.out.println(character.getDEF());
        assertEquals("DEF: 3.0", character.getDEF());

        character.setMove(4);
        System.out.println(character.getMove());
        assertEquals(4, character.getMove());

        character.setCamp(1);
        System.out.println(character.getCamp());
        assertEquals(1, character.getCamp());
    }
    
    /**
     * method isExist(). 
     */
    @Test
    public void isExist_test() {
        CharacterTemplate character = new CharacterTemplate();
        
        System.out.println(character.isExist());
        assertEquals(false, character.isExist());
        
        character.setATK(1);
        
        System.out.println(character.isExist());
        assertEquals(false, character.isExist());
        
        CharacterTemplate multiInput_Character = new CharacterTemplate(9,8,7,6,"HAHA");
        System.out.println(multiInput_Character.isExist());
        assertEquals(true, multiInput_Character.isExist());
    }

    @Test
    public void test() {
        // fail("Not yet implemented");
    }

}
