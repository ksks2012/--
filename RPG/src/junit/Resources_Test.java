package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import basic.data.Resources;

public class Resources_Test {
    
    /**
     * constructor.
     */
    @Test
    public void constructor_test() {
        Resources resources = new Resources(0, "blood") {

            @Override
            public void naturalIncrease() {
                storage = storage + 5;
            }
        };

        System.out.println(resources.getName());
        assertEquals("blood", resources.getName());

        System.out.println(resources.getStorage());
        assertEquals(0, resources.getStorage());
    }
    
    /**
     * setter.
     */
    @Test
    public void setter() {
        Resources resources = new Resources(0, "blood") {

            @Override
            public void naturalIncrease() {
                storage = storage + 5;
            }
        };

        resources.setName("PPP");
        System.out.println(resources.getName());
        assertEquals("PPP", resources.getName());

        resources.setStorage(13);
        System.out.println(resources.getStorage());
        assertEquals(13, resources.getStorage());
        
        resources.setStorage(-1);
        System.out.println(resources.getStorage());
        assertEquals(0, resources.getStorage());
    }

    /**
     * method naturalIncrease().
     */
    @Test
    public void naturalIncrease_test() {
        Resources resources = new Resources(0, "blood") {

            @Override
            public void naturalIncrease() {
                storage = storage + 5;
            }
        };
        
        for (int i = 0; i < 10; i++) {
            resources.naturalIncrease();
        }

        System.out.println(resources.getStorage());
        assertEquals(50, resources.getStorage());
    }
    
    /**
     * method addResources().
     */
    @Test
    public void addResources_test() {
        Resources resources = new Resources(0, "blood") {

            @Override
            public void naturalIncrease() {
                storage = storage + 5;
            }
        };
        
        resources.addResources(100);

        System.out.println(resources.getStorage());
        assertEquals(100, resources.getStorage());
    }
    
    /**
     * method reduceResources().
     */
    @Test
    public void reduceResources_test() {
        Resources resources = new Resources(10, "blood") {

            @Override
            public void naturalIncrease() {
                storage = storage + 5;
            }
        };
        
        if (!resources.isMore(100)) {
            resources.reduceResources(100);
        }

        System.out.println(resources.getStorage());
        assertEquals(10, resources.getStorage());
        
        if (!resources.isMore(5)) {
            resources.reduceResources(5);
        }

        System.out.println(resources.getStorage());
        assertEquals(5, resources.getStorage());
    }

    @Test
    public void test() {

    }

}
