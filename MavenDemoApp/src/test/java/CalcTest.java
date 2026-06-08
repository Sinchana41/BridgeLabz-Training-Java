
import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalcTest {

    Calc calc ;

    @BeforeAll
    void testBeforeAll(){
        System.out.println("Before All");
    }

    @BeforeEach
    void testBeforeEach(){
        calc = new Calc();
        System.out.println("Before Each");
    }

    @Test
    void  addTest(){
       Assertions.assertEquals(10,calc.add(3,7));
    }

    @Test
    void  subtractTest(){
        Assertions.assertTrue(3 == calc.subtract(7,4));
    }

    @Test
    void  multiplyTest(){
        Assertions.assertFalse(101 == calc.multiply(10,10));
    }

    @Test
    void  divideTest(){
        Assertions.assertThrows(ArithmeticException.class,()->calc.divide(10,0));
    }


    @Test
    void  modulusTest(){
        Assertions.assertNotEquals(10,calc.modulus(20,4));
    }

    @AfterEach
    void testAfterEach(){
        System.out.println("After Each");
    }


    @AfterAll
    void testAfterAll(){
        System.out.println("After All");
    }
}
