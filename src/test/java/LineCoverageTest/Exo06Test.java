package LineCoverageTest;

import org.exemple.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exo06Test {
    private FizzBuzz fizzBuzz ;
    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz() ;
    }
    @Test
    public void IllegalArgumentExceptionTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzBuzz(-15));
    }
    @Test
    public void FizzBuzzTestDiviBy3(){
        String results  = fizzBuzz.fizzBuzz(33) ;
        Assertions.assertEquals("Fizz",results);
    }
    @Test
    public void FizzBuzzTestDiviBy5(){
        String results  = fizzBuzz.fizzBuzz(10) ;
        Assertions.assertEquals("Buzz",results);
    }
    @Test
    public void FizzBuzzTestDiviBy5And3(){
        String results  = fizzBuzz.fizzBuzz(30) ;
        Assertions.assertEquals("FizzBuzz",results);
    }
    @Test
    public void FizzBuzzTestNotDiviBy5_Or_3(){
        String results  = fizzBuzz.fizzBuzz(8) ;
        Assertions.assertEquals("8",results);
    }
}
