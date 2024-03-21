package LineCoverageTest;

import org.exemple.QuadraticEquation;
import org.exemple.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exo05Test {
    private RomanNumeral romanNumeral  ;
    @BeforeEach
    public void setUp(){
        romanNumeral = new RomanNumeral() ;
    }
    @Test
    public void IllegalArgumentExceptionTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> romanNumeral.toRoman(5000));
    }
    @Test
    public void RomanNumeralTest(){
     String results  = romanNumeral.toRoman(1) ;
     Assertions.assertEquals("I",results);
    }

}
