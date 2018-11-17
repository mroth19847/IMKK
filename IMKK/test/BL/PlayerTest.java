
package BL;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(value = Parameterized.class)

public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Parameter(value = 0)

    public String playerName;
    
    @Parameter(value = 1)

    public String enemyName;
    
    @Parameter(value = 2)

    public int playerAttack;
    
    @Parameter(value = 3)

    public int playerDefense;
    
    @Parameter(value = 4)

    public int enemyAttack;
    
    @Parameter(value = 5)

    public int enemyDefense;
    
    @Parameter(value = 6)

    public String winnerName;
        
    @Parameterized.Parameters(name = "{index}: {6} won")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
            {"Knight1","Knight2",150,50,130,50,"Knight1"},
            {"Knight1","Knight2",150,50,130,80,"Knight2"},
            {"Knight1","Knight2",200,0,100,90,"Knight1"},
            {"Knight1","Knight2",0,210,100,100,"Knight1"},
            {"Knight1","Knight2",55,155,210,5,"Knight2"}
        });
    }
    
    @Test
    public void testFight() throws Exception {
        Player enemy = new Knight(enemyName);
        enemy.setAttack(enemyAttack);
        enemy.setDefense(enemyDefense);
        Player instance = new Knight(playerName);
        instance.setAttack(playerAttack);
        instance.setDefense(playerDefense);
        String expResult = winnerName;
        String result = instance.fight(enemy).getName();
        assertEquals(expResult, result);
    }
    
}
