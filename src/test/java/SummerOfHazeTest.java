


import org.junit.*;
import osnova.SummerOfHaze;


import static org.junit.Assert.*;

public class SummerOfHazeTest {
    private SummerOfHaze Haze;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before SummerOfHazeTest.class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterSummerOfHazeTest.class");
    }

    @Before
    public void initTest(){
      Haze = new SummerOfHaze();
    }

//    @After
//    public static endTest(){
//        //Haze = null;
//    }

    @Test
    public void testSummer() throws Exception{
        assertEquals(17,Haze.summer(15,2));
    }

    @Test
    public void testleSummer()throws Exception{
        assertEquals(23,Haze.summer(21,2));
    }
}