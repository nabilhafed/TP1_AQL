package LineCoverageTest;

import org.exemple.Palindrome;
import org.exemple.PalindromeCorrection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exo1Test {
    private Palindrome   palindrome ;
    @BeforeEach
    public void setup(){

        palindrome = new Palindrome() ;
    }
    @Test
    public void isPalindromeTestNull(){
        Assertions.assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));

    }

    @Test
    public void isPalindromeCorrection(){
        PalindromeCorrection palindromeCorr = new PalindromeCorrection() ;
        boolean results  = palindromeCorr.isPalindrome("aaaaaa");
        Assertions.assertEquals(true,results);
    }
}
