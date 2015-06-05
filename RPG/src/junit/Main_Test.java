package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import basic.data.MonsterTemplate;
import basic.data.TeamTemplate;

public class Main_Test {

    static final int campPlayer = 1;
    static final int campEnemy = 2;

    public Main_Test() {
        ;
    }

    /**
     * constructor().
     */
    @Test
    public void constructor_test() {
        TeamTemplate teamTemplate = new TeamTemplate();

        System.out.println(teamTemplate.getCamp());
        assertEquals(campPlayer, teamTemplate.getCamp());
        
        MonsterTemplate monsterTemplate = new MonsterTemplate();
        
        System.out.println(monsterTemplate.getCamp());
        assertEquals(campEnemy, monsterTemplate.getCamp());
    }
    
    /**
     * constructor(multi).
     */
    @Test
    public void multi_constructor_test() {
        TeamTemplate teamTemplate = new TeamTemplate(9,8,7,6,"HAHA");

        System.out.println(teamTemplate.getCamp());
        assertEquals(campPlayer, teamTemplate.getCamp());
        
        MonsterTemplate monsterTemplate = new MonsterTemplate(9,8,7,6,"HAHA");
        
        System.out.println(monsterTemplate.getCamp());
        assertEquals(campEnemy, monsterTemplate.getCamp());
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
